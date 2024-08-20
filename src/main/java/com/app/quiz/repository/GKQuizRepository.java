package com.app.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.quiz.model.GKQuiz;

public interface GKQuizRepository extends JpaRepository<GKQuiz, Long> {

}
