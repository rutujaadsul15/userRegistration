package com.example.userRegistration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class SignInRequest {
    @NotBlank(message = "ALL FIELDS ARE MANDATORY, PLEASE FILL ALL THE REQUIRED DETAILS")
    public String username;

    @NotBlank(message = "ALL FIELDS ARE MANDATORY, PLEASE FILL ALL THE REQUIRED DETAILS")
    private String password;
}
