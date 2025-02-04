package com.app.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.quiz.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
