package com.example.userRegistration.controller;


import com.example.userRegistration.model.SignInRequest;
import com.example.userRegistration.model.User;
import com.example.userRegistration.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;


    @PostMapping("/registration")
    public ResponseEntity<User> userRegistration(@RequestBody @Valid User user) {
        User userData = userServiceImpl.userRegistration(user);

        if (userData != null) {
            return ResponseEntity.ok(userData);
        }
        return ResponseEntity.internalServerError().body(null);


    }

    @PostMapping("/signIn")
    public ResponseEntity<User> UserSignIn(@RequestBody @Valid SignInRequest signInRequest) {
        User userSignIn = userServiceImpl.userSignIn(signInRequest);
        if (userSignIn != null) {
            return ResponseEntity.ok(userSignIn);
        }
        return ResponseEntity.internalServerError().body(null);



    }
}
