package com.springboot.Crud.service;

public interface Services {
    // interface que contiene el método run
    // que se ejecutará al iniciar la aplicación
    // y que recibe un array de String como parámetro
    // y que puede lanzar una excepción
    // en este caso, la excepción será la que se lance
    // en el método run
    void run(String... args) throws Exception;
}
