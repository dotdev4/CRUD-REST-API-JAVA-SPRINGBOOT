package com.springboot.Crud.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


// para crear el setter y getter
@Getter
@Setter

// para crear el constructor vacio
@NoArgsConstructor
// para crear el constructor con todos los atributos
@AllArgsConstructor
// para crear la tabla
@Entity
// para crear la tabla con el nombre que queramos
@Table(name = "employees")
public class Employee {
    // para crear el ID
    @Id
    // para que el ID sea autoincrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // para crear las columnas
    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "emailId")
    private String emailId;




}
