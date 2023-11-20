//package com.example.demo.service;
//import com.example.demo.repository.QuestionRepo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GameService {
//    private final QuestionRepo questionRepo;
//
//    public GameService(QuestionRepo questionRepo) {
//        this.questionRepo = questionRepo;
//    }
//
//    public static List<QuestionService> initializeQuestions() {
//            List<QuestionService> questions = new ArrayList<>();
//
//            List<AnswerService> answers1 = new ArrayList<>();
//            answers1.add(new AnswerService("22", false));
//            answers1.add(new AnswerService("4", true));
//            answers1.add(new AnswerService("44", false));
//            answers1.add(new AnswerService("5", false));
//            questions.add(new QuestionService("What is 2 + 2?", answers1));
//
//            List<AnswerService> answers2 = new ArrayList<>();
//            answers2.add(new AnswerService("Rick", true));
//            answers2.add(new AnswerService("Jick", false));
//            answers2.add(new AnswerService("Bick", false));
//            answers2.add(new AnswerService("Morty", false));
//            questions.add(new QuestionService("What is Rick's name?", answers2));
//
//            List<AnswerService> answers3 = new ArrayList<>();
//            answers3.add(new AnswerService("A", true));
//            answers3.add(new AnswerService("B", false));
//            answers3.add(new AnswerService("C", false));
//            answers3.add(new AnswerService("Triangle", false));
//            questions.add(new QuestionService("What is the first letter of the alphabet?", answers3));
//
//            // Add more questions as needed
//            return questions;
//        }
//
//}