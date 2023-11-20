package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import com.example.demo.entity.Dog;
import com.example.demo.entity.TaipeiBank;

public class ClassTest {

	@Test
	public void classTest(){
//		假如dog屬性有開放變成public的話我就可以抓出來做使用
		Dog dog = new Dog();
//		dog.age =5;
//		int age = dog.age;
//		System.out.println(age);
		
//		預設抓取dog的變數
		String name = dog.getName();
		System.out.println(name);
//		把dog的變數變成lily
		dog.setName("lily");
		name = dog.getName();
		System.out.println(name);
		
//		預設抓取dog的年紀
		int age = dog.getAge();
		System.out.println(age);
		dog.setAge(20);
		age = dog.getAge();
		System.out.println(age);
		
//		一次宣告一堆變數
		dog.setAttribuates("jason", "yellow", 18);
		
		
	}
	
	@Test
	public void BankTest(){
		TaipeiBank info = new TaipeiBank();
		info.saving(20000);
		info.expensing(10000);
		int balance = info.getBalance();
		System.out.println(balance);
//		下方那個可以去判斷tru或false  是true的話沒事 false的話會跑後面那個字串
//		Assert.isTrue(info.getBalance()==1000,"saving error!!");
	}
	
	@Test
	public void Prime(){
		System.out.println("請輸入一個數字");
		Scanner scan = new Scanner(System.in);
		int enterNum = scan.nextInt();
		List<Integer>  primeList =  new ArrayList<>();
		
		for(int i = 2; i < enterNum ; i++) {
			boolean isPrime = true;
			for(int j=2 ; j<Math.sqrt(i)+1;j++) {
				if(i==j) {
					break;
				}
				if(i%j==0) {
					isPrime =false;
					break;
				}	
			}
			if(isPrime) {
				primeList.add(i);
			}
				
		}
		for(Integer item : primeList) {
			System.out.println(item);
		}
		System.out.println("總共有"+primeList.size()+"個質數");
	}
	
	@Test
	public void Test1(){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		List<Integer> numList = new ArrayList<>();
		numList.add(num);
		System.out.println(numList.get(0));
	}
	
//	11/6上課
	@Test
	public void Test2(){
//		外面新增類別的記憶體位置
		System.out.println(new Dog());
		System.out.println(new TaipeiBank());
	}
	
//	11/6上課 == 的用法
	@Test
	public void Test3(){
		int a = 5;
		int b = 5;
		System.out.println(a==b);
		boolean boo1 = true;
		boolean boo2 = true;
		System.out.println(boo1==boo2);
		Integer a1 = 5;
		Integer b1 = 5;
		System.out.println(a1==b1);
//		有遇到new的就是新增記憶體空間然後塞值假如拿來比較== 的話 記憶體位置不一樣所以會false
		Integer aa = new Integer(10);
		System.out.println(aa);	
	}
//	11/6上課
	@Test
	public void Test4(){
	
	}
}
