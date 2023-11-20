package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.A;
import com.example.demo.entity.B;
import com.example.demo.entity.C;
import com.example.demo.entity.Car;
import com.example.demo.entity.Dog;

public class ExtendsTest {
	
//	���l�h���]�tanimal�@dog bird
	@Test
	public void extendsTest() {
		Animal anim = new Animal();
		System.out.println("�����O Animal Name:"+anim.getName());
		anim.eat();
		anim.sleep();
		Bird bird = new Bird();
		bird.setName("�p��");
		System.out.println("�l���O bird Name:"+bird.getName());
//		��l���O������O���ۦP��k���ɭԷ|�u���Y�l���O�� �������|�X�{
		bird.eat();
		bird.sleep();
		bird.flying();
		
//		�m�ߨϥΤ��l�h
		Cat cat = new Cat();
		cat.setName("�ڬO�p�߫}");
		System.out.println(cat.getName());
		cat.barking();
		
	}
//	�ܭ��n   ���w�O�H���O�H
	@Test
	public void extendsTest1() {
		A a = new A();
		System.out.println(a.getC().getCity());
		
		a.getC().setCity("hualian");
		System.out.println(a.getC().getCity());
		
		C c = new C("aaa","bbbb","dddd");
		System.out.println(c.getCity());
		
		B b = new B();
		System.out.println(b.getC().getCity());
	}

//	11/9  ���浲�G�W�U���@��  
	@Test
	public void extendsTest2() {
//		�I�s�l���O
		Animal anim = new Animal();
		anim.eat();
		Bird bird = new Bird();
		bird.eat();
		Cat cat = new Cat();
		cat.eat();
		System.out.println("================");
//		�I�s�����O
		Animal animm = new Animal();
		animm.eat();
		Animal birdd = new Bird();
		birdd.eat();
		Animal catt = new Cat();
		catt.eat();
	}
	@Test
	public void interfaceTest() {
		Car car = new Car();
		car.run();
		Dog dog = new Dog();
		dog.run();
	}
	
}
