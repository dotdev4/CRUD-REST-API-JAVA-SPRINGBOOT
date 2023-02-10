package com.springboot.Crud.controller;

import com.springboot.Crud.model.Employee;
import com.springboot.Crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// para que spring sepa que es un controller
// RestController incorpora el ResponseBody y el Controller
@RestController
// para que spring sepa que es una API REST
// y que se le añada el prefijo /api/v1/employees
// a todas las rutas

@RequestMapping("/api/v1/employees")
public class EmployeeController {

    // para enlazar el repositorio
    @Autowired
    private EmployeeRepository employeeRepository;

    // para obtener todos los empleados
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    // para obtener un empleado por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        if(!employee.isPresent()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(employee.get());
    }

    // para crear un empleado
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println("Employee: " + employee.toString());
        return employeeRepository.save(employee);
    }

    // para actualizar un empleado utilizando su ID
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateEmployee(@PathVariable(value = "id") long id, @RequestBody Employee employeeDetails) {
        System.out.println(" " + id);
        Optional<Employee> productsOptional = employeeRepository.findById(id);
        if (!productsOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        employeeDetails.setId(id);
        employeeRepository.save(employeeDetails);
        return ResponseEntity.noContent().build();
    }

    // para eliminar un empleado utilizando su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable(value = "id") long id) {
        System.out.println(" " + id);
        Optional<Employee> productsOptional = employeeRepository.findById(id);
        if (!productsOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        employeeRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    // para eliminar todos los empleados
    @DeleteMapping
    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }
}