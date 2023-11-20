package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="meal")
@IdClass(value = MealId.class)
public class Meal {
	
	@Id
	@Column(name ="name")
	private String name;
	
	@Id
	@Column(name ="cooking_style")
	private String cookingstyle;
	
	@Column(name ="price")
	private int price;

	public Meal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meal(String name, String cooking_style, int price) {
		super();
		this.name = name;
		this.cookingstyle = cooking_style;
		this.price = price;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
