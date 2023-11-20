package com.example.demo.repository;

import com.example.demo.model.Scoreboard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreboardRepo extends JpaRepository<Scoreboard, Long> {
//    List<Scoreboard> findTopScores(int limit);
}