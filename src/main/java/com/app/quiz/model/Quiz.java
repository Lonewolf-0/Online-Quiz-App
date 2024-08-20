package com.app.quiz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "quiz")
public class Quiz {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(name = "category", nullable = false)
    private String category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Quiz() {
		
	}
	public Quiz(long id, String category) {
		this.category = category;
	}
}
