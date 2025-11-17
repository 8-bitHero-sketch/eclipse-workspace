package com.studybuddy.quiz_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studybuddy.quiz_system.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    // Spring Data JPA automatically provides:
    // - save()
    // - findAll()
    // - findById()
    // - delete()
    // No code needed!
}