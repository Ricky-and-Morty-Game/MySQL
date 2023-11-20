package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository interface that will interact with our User entity class
// Spring JPA UserRepository classes will allow more funcitonality later
// when it is needed. We will have the ability to filter and search our database
// through the methods provided here.
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String username);
}