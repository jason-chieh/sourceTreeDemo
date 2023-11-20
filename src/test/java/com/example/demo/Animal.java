package com.example.demo;

public class Animal {
	
	public Animal() {
		super();
		System.out.println("animal建構方法");
		// TODO Auto-generated constructor stub
	}
	
	private String name = "預設名字";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println(this.name+"正在吃!");
	}

	public void sleep() {
		System.out.println(this.name+"正在睡!");
	}
}
