package com.springboot.Crud.repository;

import com.springboot.Crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// para crear el repositorio
// para poder hacer las consultas a la base de datos
// JpaRepository es una interfaz que nos permite hacer
// las consultas a la base de datos
// y que recibe dos parámetros:
// 1. La clase que queremos mapear
// 2. El tipo de dato del ID
// en este caso Employee y Long JpaRepository tiene métodos como:
// findAll(), findById(), save(), deleteById(), etc
// JpaRepository es una interfaz que extiende de PagingAndSortingRepository
// que a su vez extiende de CrudRepository
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
