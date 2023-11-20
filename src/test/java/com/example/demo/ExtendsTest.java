package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.entity.A;
import com.example.demo.entity.B;
import com.example.demo.entity.C;
import com.example.demo.entity.Car;
import com.example.demo.entity.Dog;

public class ExtendsTest {
	
//	父子層介包含animal　dog bird
	@Test
	public void extendsTest() {
		Animal anim = new Animal();
		System.out.println("父類別 Animal Name:"+anim.getName());
		anim.eat();
		anim.sleep();
		Bird bird = new Bird();
		bird.setName("小花");
		System.out.println("子類別 bird Name:"+bird.getName());
//		當子類別跟父類別有相同方法的時候會優先吃子類別的 父的不會出現
		bird.eat();
		bird.sleep();
		bird.flying();
		
//		練習使用父子層
		Cat cat = new Cat();
		cat.setName("我是小貓咪");
		System.out.println(cat.getName());
		cat.barking();
		
	}
//	很重要   取德別人的別人
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

//	11/9  執行結果上下都一樣  
	@Test
	public void extendsTest2() {
//		呼叫子類別
		Animal anim = new Animal();
		anim.eat();
		Bird bird = new Bird();
		bird.eat();
		Cat cat = new Cat();
		cat.eat();
		System.out.println("================");
//		呼叫父類別
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
