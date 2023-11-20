package com.example.demo.service;

import com.example.demo.model.Questions;
import com.example.demo.repository.QuestionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

//import java.util.List;
//
//public class QuestionService {
//    private String questionText;
//    private List<AnswerService> answers;
//
//    public QuestionService(String questionText, List<AnswerService> answers) {
//        this.questionText = questionText;
//        this.answers = answers;
//    }
//    public String getQuestionText() {
//        return questionText;
//    }
//    public List<AnswerService> getAnswers() {
//        return answers;
//    }
//}
@Service
public class QuestionService {
    private final QuestionRepo questionRepo;

    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }
    public List<Questions> getAllQuestions() {
        return questionRepo.findAll();
    }
}