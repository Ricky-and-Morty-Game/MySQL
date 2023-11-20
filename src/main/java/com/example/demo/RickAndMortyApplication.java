package com.example.demo;

import com.example.demo.model.Answers;
import com.example.demo.model.Questions;
import com.example.demo.service.AnswerService;
//import com.example.demo.service.GameService;
import com.example.demo.service.QuestionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.model.Scoreboard;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;


@SpringBootApplication
@EnableJpaRepositories("com.example.demo.repository")
public class RickAndMortyApplication {
    public static void main(String[] args) {
        SpringApplication.run(RickAndMortyApplication.class, args);
//            // After user authentication
//            // String username = getUserNameFromLoggedInUser(); // Implement this method to get the player name
//
//
//            // Entity manager used to communicate with SQL database to grab pre-constructed questions
//            // Make sure to set up the persistence.xml with a local copy of the questions database, otherwise the demo will not work
//            java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.WARNING);
//            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("RickMorty");
//            EntityManager entityManager = entityManagerFactory.createEntityManager();
//            EntityTransaction transaction = entityManager.getTransaction();
//
//            try {
//                //send score to datatable
//                entityManager.getTransaction().begin();
//
//                Scanner scanner = new Scanner(System.in); // Create a Scanner for user input
//
//                // Initialize the game with questions from TriviaQuestions(where all the actual questions and answers are)
//                //List<QuestionService> questions = GameService.initializeQuestions();
//                List<Questions> questions = entityManager.createQuery("SELECT q FROM Questions q", Questions.class)
//                        .getResultList();
//                int score = 0; // Keeps track of the player's score
//
//                //game loop: iterates through list of questions
//                for (Questions question : questions) { //takes question login paired with the actual question
//                    System.out.println(question.getQuestionText()); //outputs the question text
//
//                    //list of answer choices
//                    //getAnswers from the questionLogic to display the answer choices
//                    List<Answers> answers = question.getAnswers();
//                    for (int i = 0; i < answers.size(); i++) {
//                        System.out.println((i + 1) + ". " + answers.get(i).getAnswerText());
//                    }
//
//                    //prompts the user and reads the input
//                    System.out.print("Enter your choice: ");
//                    int userChoice = scanner.nextInt();
//
//                    //selects user's answer based on their input
//                    //-1 converts the list to an index of 0,1,2,3; enter 1 and it converts it to index0
//                    //then is stored in selected answer
//                    AnswerService selectedAnswer = new AnswerService(answers.get(userChoice - 1));
//
//                    //checks if the selected answer is correct when it returns true
//                    if (selectedAnswer.isCorrect()) {
//                        System.out.println("Correct!");
//                        score++;
//                    } else {
//                        System.out.println("Incorrect.");
//                    }
//                }
//
//                System.out.println("Your Score: " + score + "/" + questions.size());
//
//                // Close the scanner
//                scanner.close();
//
//                //set the username to the score
//                Scoreboard scoreBoard = new Scoreboard();
//                scoreBoard.setUserName("username1"); //set the username
//                scoreBoard.setScore(score);//set the score
//
//                // record the current time
//                LocalDateTime currentTimestamp = LocalDateTime.now();
//                scoreBoard.setTimestamp(Timestamp.valueOf(currentTimestamp));
//
//                //save the score to the scoreboard
//                entityManager.persist(scoreBoard);
//                entityManager.getTransaction().commit();
//
//                //get the top 10 scores
//                //
//                List<Scoreboard> topScore = entityManager.createQuery("SELECT s FROM Scoreboard s ORDER BY s.score DESC," +
//                                "s.timestamp ASC", Scoreboard.class)
//                        .setMaxResults(10)
//                        .getResultList();
//
//                //out print the score
////            System.out.println("Highest Score: " + highScore);
//                System.out.println("Top 10 Scores:");
//                for (Scoreboard scores : topScore) {
//                    System.out.println("User: " + scores.getUserName() + " | Score: " + scores.getScore());
//                }
//            } finally {
//                if (transaction.isActive()) {
//                    transaction.rollback();
//                }
//                entityManager.close();
//                entityManagerFactory.close();
//            }
//        }
    }
}
