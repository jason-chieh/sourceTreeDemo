package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grade")
public class Grade {
	
	@Id
	@Column(name="name")
	private String name;
	
	@Column(name="gradenum")
	private int grade;
	
	public Grade() {
		super();
	}

	public Grade(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	
	
	
	

}
