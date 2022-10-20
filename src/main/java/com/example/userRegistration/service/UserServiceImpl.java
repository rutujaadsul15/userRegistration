package com.example.userRegistration.service;

import com.example.userRegistration.exception.UserNotFoundException;
import com.example.userRegistration.model.SignInRequest;
import com.example.userRegistration.model.User;
import com.example.userRegistration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    public User userRegistration(User user) {
        Optional<User> dbUser = userRepository.findById(user.getUsername());
        if (dbUser.isPresent()) {
            throw new RuntimeException("USER IS ALREADY EXIST WITH THIS NAME, PLEASE GIVE ANOTHER NAME ");
        } else {
            System.out.println(user);
            return userRepository.save(user);

        }
    }

    @Override
    public User userSignIn(SignInRequest signInRequest) {
        User user = new User();
        String str = signInRequest.getUsername();
        Optional<User> byId = userRepository.findById(str);
         if(byId.isPresent()){
             User dbUser = byId.get();
             if ( dbUser.getPassword().equals(signInRequest.getPassword())){
                 return dbUser;
             }

         }else{
             throw new RuntimeException( "CHECK YOU USERNAME AND PASSWORD");
         }
         return null;

    }


}
