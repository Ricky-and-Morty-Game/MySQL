package com.example.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "questions")
public class Questions {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "question_id")
    private int questionId;
    @Basic
    @Column(name = "question_text")
    private String questionText;
    //@Basic
    //@Column(name = "correctAns")
    ///private String correctAnswer;
    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    private List<Answers> answers;

    public List<Answers> getAnswers() {
        return answers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Questions questions = (Questions) o;

        if (questionId != questions.questionId) return false;
        if (!Objects.equals(questionText, questions.questionText))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = questionId;
        result = 31 * result + (questionText != null ? questionText.hashCode() : 0);
        return result;
    }
}