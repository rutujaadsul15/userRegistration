package com.example.userRegistration.service;

import com.example.userRegistration.model.SignInRequest;
import com.example.userRegistration.model.User;

public interface UserService {
    public User userRegistration(User user);

    User userSignIn(SignInRequest signUpRequest);




}
