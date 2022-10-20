package com.example.userRegistration.exception;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class UserNotFoundException extends  RuntimeException {

    private String entityName;
    private String messageString;

    public UserNotFoundException(String entity, String message) {
        super(entity + " " + message);
        entityName = entity;
        messageString = message;
    }
}
