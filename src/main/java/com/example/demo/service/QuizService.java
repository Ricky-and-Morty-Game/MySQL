package com.example.demo.service;

import com.example.demo.model.Answers;
import com.example.demo.model.Questions;
import com.example.demo.model.Scoreboard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    private final QuestionService questionService;
    private final AnswerService answerService;
    private final ScoreboardService scoreboardService;

    public QuizService(QuestionService questionService, AnswerService answerService, ScoreboardService scoreboardService) {
        this.questionService = questionService;
        this.answerService = answerService;
        this.scoreboardService = scoreboardService;
    }

    public QuizResult submitQuizAnswers(List<Answers> userAnswers) {
        List<Questions> questions = questionService.getAllQuestions();
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            Answers userAnswer = userAnswers.get(i);
            Questions question = questions.get(i);
            boolean isCorrect = answerService.isAnswerCorrect(userAnswer);
            if (isCorrect) {
                score++;
            }
        }
        return new QuizResult(score, questions.size());
    }
    public void saveScoreboardEntry(Scoreboard scoreboard) {
        scoreboardService.saveScoreboardEntry(scoreboard);
    }
//    public List<Scoreboard> getTopScores(int limit) {
//        return scoreboardService.getTopScores(limit);
//    }
}
