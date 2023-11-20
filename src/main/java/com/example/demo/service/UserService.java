package com.example.demo.service;

import com.example.demo.repository.UserRepo;
import com.example.demo.model.User;
//import com.example.demo.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder;

    public UserService(UserRepo userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        //this.roleRepo = roleRepo;
        this.passwordEncoder = passwordEncoder;
    }
    public void userRegistration(String userName, String name, String password, String email) {
        User user = new User();
        user.setUsername(userName);
        user.setName(name);
        //encrypt the password once we integrate spring security
        user.setPassword(passwordEncoder.encode(password));
        user.setEmail(email);
//        Role role = roleRepo.findByName("ROLE_ADMIN");
//        if (role == null) {
//            role = checkRoleExist();
//        }
//        user.setRoles(Arrays.asList(role));
        userRepo.save(user);
        // Method that will push information to our DB
    }
    public boolean authenticateUser(String username, String password) {
        User user = userRepo.findByUsername(username);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

//    private Role checkRoleExist() {
//        Role role = new Role();
//        role.setName("ROLE_ADMIN");
//        return roleRepo.save(role);
//    }

    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }
}


