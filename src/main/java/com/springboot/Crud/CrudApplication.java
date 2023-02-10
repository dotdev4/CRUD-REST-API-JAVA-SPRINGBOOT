package com.springboot.Crud;

import com.springboot.Crud.model.Employee;
import com.springboot.Crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// para especificar que es una aplicación Spring Boot
@SpringBootApplication
public class CrudApplication{

	public static void main(String[] args) {
		// springapllication.run ejecuta la aplicación
		// y recibe como parámetro la clase principal
		// de la aplicación
		// en este caso, la clase CrudApplication
		// que es la que contiene el método main
		// y que es la que se ejecuta al iniciar la aplicación
		// y que recibe como parámetro un array de String
		// que son los argumentos que se le pasan al método main
		// en este caso, no se le pasan argumentos
		// por lo que el array de String estará vacío
		// y que puede lanzar una excepción
		// en este caso, la excepción será la que se lance
		// en el método run
		SpringApplication.run(CrudApplication.class, args);
	}

}
