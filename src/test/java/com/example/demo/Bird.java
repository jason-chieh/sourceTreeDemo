package com.example.demo;

public class Bird extends Animal{
	
	public Bird() {
		super();
		System.out.println("bird�غc��k");
			// TODO Auto-generated constructor stub
	}
	//	�o��l���O����h���ۦP��k�W�� �{�b�o��l���O�O�]�g�@�Ӥ@�˪��A�L�|�Ƽg�л\�����h����k
//	�|��@Override �i�������O���ۦP��k
	@Override
	public void eat() {
		System.out.println(super.getName()+"!!!!!!!!���b�Y!");
	}
	@Override
	public void sleep() {
		System.out.println(super.getName()+"!!!!!!!!!!���b��!");
	}
	public void flying() {
		System.out.println(super.getName()+"���b��!");
	}
}
