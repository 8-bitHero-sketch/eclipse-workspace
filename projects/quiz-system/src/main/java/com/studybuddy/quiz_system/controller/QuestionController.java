package com.studybuddy.quiz_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studybuddy.quiz_system.model.Question;
import com.studybuddy.quiz_system.model.Quiz;
import com.studybuddy.quiz_system.repository.QuestionRepository;
import com.studybuddy.quiz_system.repository.QuizRepository;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    
    @Autowired
    private QuestionRepository questionRepository;
    
    @Autowired
    private QuizRepository quizRepository;
    
    // Get all questions for a specific quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuiz(@PathVariable Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
    
    // Create a new question for a quiz
    @PostMapping("/quiz/{quizId}")
    public Question createQuestion(@PathVariable Long quizId, @RequestBody Question question) {
        Quiz quiz = quizRepository.findById(quizId)
                .orElseThrow(() -> new RuntimeException("Quiz not found with id: " + quizId));
        
        question.setQuiz(quiz);
        return questionRepository.save(question);
    }
    
    // Get all questions
    @GetMapping
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
    
    // Delete a question
    @DeleteMapping("/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        questionRepository.deleteById(id);
        return "Question deleted successfully!";
    }
}
