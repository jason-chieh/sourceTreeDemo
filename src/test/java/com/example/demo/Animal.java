package com.example.demo;

public class Animal {
	
	public Animal() {
		super();
		System.out.println("animal�غc��k");
		// TODO Auto-generated constructor stub
	}
	
	private String name = "�w�]�W�r";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println(this.name+"���b�Y!");
	}

	public void sleep() {
		System.out.println(this.name+"���b��!");
	}
}