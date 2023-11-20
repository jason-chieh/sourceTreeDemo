package com.example.demo.entity;

import com.example.demo.service.ifs.RunService;

public class Dog implements RunService{

	private String name = "apple";

	private String color;

	private int age = 18;
	
//	預設建構方法 要使用的話 可以搭配下面那個public dog一起使用  下面那個要使用 這個預設建構方法一定要寫
//	連接資料庫的話也要連接這個
//	帶有屬性的建構方法 一定要生成預設建構方法
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Dog(String name, String color, int age) {
	super();
	this.name = name;
	this.color = color;
	this.age = age;
}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	一次宣告一堆變數
	
	public void setAttribuates(String name,String color,int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public  void setAttribuates1() {
		System.out.println("===================");
	}
	public static void setAttribuates2() {
		System.out.println("===================");
	}

	@Override
	public void run() {
		System.out.println("狗狗在跑");
	}

}
