package com.app.quiz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GK")
public class GKQuiz {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	@Column(name = "category", nullable = false)
    private String category;
	@Column(name = "question", nullable = false)
    private String question;
    @Column(name = "option1", nullable = false)
    private String option1;
    @Column(name = "option2", nullable = false)
    private String option2;
    @Column(name = "option3", nullable = false)
    private String option3;
    @Column(name = "option4", nullable = false)
    private String option4;
    @Column(name = "answer", nullable = false)
    private String answer;
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
    
	public GKQuiz() {
		
	}
    public GKQuiz(String question, String option1, String option2, String option3, String option4, String answer) {
		this.question=question;
		this.option1=option1;
		this.option2=option2;
		this.option3=option4;
		this.option4=option4;
		this.answer=answer;
	}
}