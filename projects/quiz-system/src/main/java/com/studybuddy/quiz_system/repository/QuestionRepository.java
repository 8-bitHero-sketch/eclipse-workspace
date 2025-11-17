package com.studybuddy.quiz_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studybuddy.quiz_system.model.Question;
import com.studybuddy.quiz_system.model.Quiz;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    
    // Find all questions for a specific quiz
    List<Question> findByQuiz(Quiz quiz);
    
    // Find all questions for a quiz by quiz ID
    List<Question> findByQuizId(Long quizId);
}