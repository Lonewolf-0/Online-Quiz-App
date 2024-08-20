package com.app.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.quiz.model.AttemptQuiz;

public interface AttemptQuizRepository extends JpaRepository<AttemptQuiz, Long> {
	List<AttemptQuiz> findByUsername(String username);
}
