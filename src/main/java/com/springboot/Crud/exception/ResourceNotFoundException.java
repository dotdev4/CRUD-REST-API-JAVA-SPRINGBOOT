package com.springboot.Crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


// para establecer el código de estado HTTP
// en caso de que no se encuentre el recurso
// en este caso, el código de estado será 404 NOT_FOUND
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        // para enviar el mensaje de error
        super(message);
    }
}
