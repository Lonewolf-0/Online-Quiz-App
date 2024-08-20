package com.app.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.quiz.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
