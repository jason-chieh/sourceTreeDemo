package com.example.demo.entity;

import com.example.demo.service.ifs.RunService;

public class Dog implements RunService{

	private String name = "apple";

	private String color;

	private int age = 18;
	
//	�w�]�غc��k �n�ϥΪ��� �i�H�f�t�U������public dog�@�_�ϥ�  �U�����ӭn�ϥ� �o�ӹw�]�غc��k�@�w�n�g
//	�s����Ʈw���ܤ]�n�s���o��
//	�a���ݩʪ��غc��k �@�w�n�ͦ��w�]�غc��k
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
	
//	�@���ŧi�@���ܼ�
	
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
		System.out.println("�����b�]");
	}

}
