package com.example.userRegistration.repository;

import com.example.userRegistration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String> {
}
