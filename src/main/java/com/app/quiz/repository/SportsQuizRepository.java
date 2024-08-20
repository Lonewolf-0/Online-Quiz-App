package com.app.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.quiz.model.SportsQuiz;

public interface SportsQuizRepository extends JpaRepository<SportsQuiz, Long> {

}