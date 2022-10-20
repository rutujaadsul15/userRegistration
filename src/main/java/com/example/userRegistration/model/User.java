package com.example.userRegistration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    @Id
    public String username;

    @NotBlank(message = "ALL FIELDS ARE MANDATORY, PLEASE FILL ALL THE REQUIRED DETAILS")
    private String firstName;

    @NotBlank(message = "ALL FIELDS ARE MANDATORY, PLEASE FILL ALL THE REQUIRED DETAILS")
    private String lastName;

    @NotBlank(message = "ALL FIELDS ARE MANDATORY, PLEASE FILL ALL THE REQUIRED DETAILS")
    private String address;

    @NotBlank(message = "ALL FIELDS ARE MANDATORY, PLEASE FILL ALL THE REQUIRED DETAILS")
    private String password;
}
