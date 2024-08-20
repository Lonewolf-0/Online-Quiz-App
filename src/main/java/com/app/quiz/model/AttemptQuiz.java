package com.app.quiz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Attempt_Quiz")
public class AttemptQuiz {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(name = "username", nullable = false)
    private String username;
	@Column(name = "category", nullable = false)
    private String category;
	@Column(name = "date", nullable = false)
    private String date;
	@Column(name = "marks", nullable = false)
    private int marks;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public AttemptQuiz() {
		
	}
	public AttemptQuiz(String username, String category, String date, int marks) {
		this.username = username;
		this.category = category;
		this.date = date;
		this.marks = marks;
	}
	
	
}
