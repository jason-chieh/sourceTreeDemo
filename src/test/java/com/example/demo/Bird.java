package com.example.demo;

public class Bird extends Animal{
	
	public Bird() {
		super();
		System.out.println("bird建構方法");
			// TODO Auto-generated constructor stub
	}
	//	這邊子類別跟父層有相同方法名稱 現在這邊子類別別也寫一個一樣的，他會複寫覆蓋掉父層的方法
//	會用@Override 告知父類別有相同方法
	@Override
	public void eat() {
		System.out.println(super.getName()+"!!!!!!!!正在吃!");
	}
	@Override
	public void sleep() {
		System.out.println(super.getName()+"!!!!!!!!!!正在睡!");
	}
	public void flying() {
		System.out.println(super.getName()+"正在飛!");
	}
}
