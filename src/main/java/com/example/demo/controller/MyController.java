package com.example.demo.controller;

import com.example.demo.model.Questions;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.ScoreboardService;
import com.example.demo.service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {
    private UserService userService;
    private EntityManager entityManager;
    private final ScoreboardService scoreboardService;
    private final UserRepo userRepo;


    public MyController(UserService userService, EntityManagerFactory entityManagerFactory, ScoreboardService scoreboardService, UserRepo userRepo) {
        this.userService = userService;
        this.entityManager = entityManagerFactory.createEntityManager();
        this.scoreboardService = scoreboardService;
        this.userRepo = userRepo;
    }

    @GetMapping("/index")
    public String home(Model model){
        int topScore = userRepo.findTopScore();
        String usernameWithTopScore = userRepo.findUsernameWithTopScore();
        List<User> users = userRepo.findAllUsersScores();
        model.addAttribute("usernameWithTopScore", usernameWithTopScore);
        model.addAttribute("topScore", topScore);
        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model ) {
        if (userService.authenticateUser(username, password)) {
            model.addAttribute("success", true);
            return "redirect:/users";
        } else {
            model.addAttribute("error", true);
            return "redirect:/login?error";
        }
    }

    // handler method to handle user registration request
    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    // handler method to handle register user form submit request
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") User user,
                               BindingResult result,
                               Model model){
        User existing = userService.findByEmail(user.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        }
        userService.userRegistration(user.getUsername(), user.getName(), user.getPassword(), user.getEmail());
        return "redirect:/register?success";
    }

    @GetMapping("/users")
    public String listRegisteredUsers(Model model){
        List<User> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/quiz")
    public String showQuiz(Model model) {
        List<Questions> questions = entityManager.createQuery("SELECT q FROM Questions q JOIN FETCH q.answers", Questions.class)
                .getResultList();
        model.addAttribute("questions", questions);
        return "quiz";
    }
}