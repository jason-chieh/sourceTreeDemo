package com.example.demo.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MealId implements Serializable{
	
	private String name;
	
	private String cookingstyle;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCooking_style() {
		return cookingstyle;
	}

	public void setCooking_style(String cooking_style) {
		this.cookingstyle = cooking_style;
	}

	public MealId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MealId(String name, String cooking_style) {
		super();
		this.name = name;
		this.cookingstyle = cooking_style;
	}
	
	
}
