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
//		���pdog�ݩʦ��}���ܦ�public���ܧڴN�i�H��X�Ӱ��ϥ�
		Dog dog = new Dog();
//		dog.age =5;
//		int age = dog.age;
//		System.out.println(age);
		
//		�w�]���dog���ܼ�
		String name = dog.getName();
		System.out.println(name);
//		��dog���ܼ��ܦ�lily
		dog.setName("lily");
		name = dog.getName();
		System.out.println(name);
		
//		�w�]���dog���~��
		int age = dog.getAge();
		System.out.println(age);
		dog.setAge(20);
		age = dog.getAge();
		System.out.println(age);
		
//		�@���ŧi�@���ܼ�
		dog.setAttribuates("jason", "yellow", 18);
		
		
	}
	
	@Test
	public void BankTest(){
		TaipeiBank info = new TaipeiBank();
		info.saving(20000);
		info.expensing(10000);
		int balance = info.getBalance();
		System.out.println(balance);
//		�U�診�ӥi�H�h�P�_tru��false  �Otrue���ܨS�� false���ܷ|�]�᭱���Ӧr��
//		Assert.isTrue(info.getBalance()==1000,"saving error!!");
	}
	
	@Test
	public void Prime(){
		System.out.println("�п�J�@�ӼƦr");
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
		System.out.println("�`�@��"+primeList.size()+"�ӽ��");
	}
	
	@Test
	public void Test1(){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		List<Integer> numList = new ArrayList<>();
		numList.add(num);
		System.out.println(numList.get(0));
	}
	
//	11/6�W��
	@Test
	public void Test2(){
//		�~���s�W���O���O�����m
		System.out.println(new Dog());
		System.out.println(new TaipeiBank());
	}
	
//	11/6�W�� == ���Ϊk
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
//		���J��new���N�O�s�W�O����Ŷ��M���Ȱ��p���Ӥ��== ���� �O�����m���@�˩ҥH�|false
		Integer aa = new Integer(10);
		System.out.println(aa);	
	}
//	11/6�W��
	@Test
	public void Test4(){
	
	}
}
