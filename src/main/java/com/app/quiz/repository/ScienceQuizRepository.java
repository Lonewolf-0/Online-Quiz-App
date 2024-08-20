package com.app.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.quiz.model.ScienceQuiz;

public interface ScienceQuizRepository extends JpaRepository<ScienceQuiz, Long> {

}
