package com.example.demo.service;

import com.example.demo.model.Scoreboard;
import com.example.demo.repository.ScoreboardRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreboardService {
    private final ScoreboardRepo scoreboardRepo;

    public ScoreboardService(ScoreboardRepo scoreboardRepo) {
        this.scoreboardRepo = scoreboardRepo;
    }
    public void saveScoreboardEntry(Scoreboard scoreboard) {
        scoreboardRepo.save(scoreboard);
    }
//    public List<Scoreboard> getTopScores(int limit) {
//        return scoreboardRepo.findTopScores(limit);
//    }
}
