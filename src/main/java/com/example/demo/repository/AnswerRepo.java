package com.example.demo.repository;

import com.example.demo.model.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo extends JpaRepository<Answers, Long> {
    @Query("SELECT a FROM Answers a WHERE a.question.questionId = :questionId AND a.isCorrect = true")
        Answers findCorrectAnswerByQuestionId(@Param("questionId") int questionId);
}