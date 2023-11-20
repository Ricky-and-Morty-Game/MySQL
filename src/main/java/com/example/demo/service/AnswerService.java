package com.example.demo.service;

import com.example.demo.model.Answers;
import com.example.demo.repository.AnswerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

//
//import com.example.demo.model.Answers;
//
//public class AnswerService {
//    private Answers answers;
//    private String answerText;
//    private boolean isCorrect;
//
//    public AnswerService(Answers answers) {
//        this.answers = answers;
//    }
//    public String getAnswerText() {
//        return answerText;
//    }
//    public boolean isCorrect() {
//        return isCorrect;
//    }
//}
@Service
public class AnswerService {
    private final AnswerRepo answerRepo;

    public AnswerService(AnswerRepo answerRepo) {
        this.answerRepo = answerRepo;
    }

    public boolean isAnswerCorrect(Answers userAnswer) {
        Answers correctAnswer = answerRepo.findCorrectAnswerByQuestionId(userAnswer.getQuestionId());
        return correctAnswer.equals(userAnswer);
    }

    public List<Answers> getAllAnswers() {
        return answerRepo.findAll();
    }

    // Additional methods for answer-related operations...
}
