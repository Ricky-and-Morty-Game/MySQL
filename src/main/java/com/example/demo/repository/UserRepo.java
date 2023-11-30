package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// Repository interface that will interact with our User entity class
// Spring JPA UserRepository classes will allow more funcitonality later
// when it is needed. We will have the ability to filter and search our database
// through the methods provided here.
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String username);

    @Query("SELECT u.username FROM User u WHERE u.score = (SELECT MAX(u1.score) FROM User u1)")
    String findUsernameWithTopScore();
    @Query("SELECT MAX(u.score) FROM User u")
    Integer findTopScore();

    @Query("SELECT u FROM User u ORDER BY u.score DESC")
    List<User> findAllUsersScores();
}