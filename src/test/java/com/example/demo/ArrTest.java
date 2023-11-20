package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArrTest {

	// 11/3陣列上課
	@Test
	public void arrayTest() {
		int[] a = new int[5];
		System.out.println(a.length);
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
//		會出現亂碼是因為那是記憶體位置
		System.out.println(a);
//		宣告同時給予初始值
		int[] b = { 1, 2, 3, 4 };
		System.out.println(b[1]);
	}

	// 11/3 上課list
	@Test
	public void listTest() {
//		list是介面(interface)無法new 目的是定義方法 
		List<String> c = new ArrayList<>();
//		list是有排序的，依照加入的先後順序
		c.add("A");
		c.add("b");
		c.add("c");
		c.add("d");
		System.out.println(c);
		System.out.println(c.size());
//		分別取值
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
//		用定義的方式給list值但是同時list得長度會被固定，不能再加入其他值
		List<String> cc = List.of("a","b","c","d");
		List<String> ccc = Arrays.asList("1a","1b","1c","1d");
		System.out.println(cc);
		System.out.println(ccc);
//		-----------------------------------------------
//		用new ArrayList 就可以動態新增東西跟刪除
		List<String> c1 = new ArrayList<>(List.of("a","b","c","d"));
		List<String> c2 = new ArrayList<>(Arrays.asList("1a","1b","1c","1d"));
		c1.add("adadadadad");
		c2.add("adadadadad");
		System.out.println(c1);
		System.out.println(c2);
	}
	
//	foreach練習
	@Test
	public void foreachTest() {
		List<String> c = new ArrayList<>(List.of("a","b","c","d"));
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
		System.out.println("================================");
//		foreach遍歷
		for(String item : c ){
			System.out.println(item);
		}
//		c.forEach(item->{
//			System.out.println(item);
//		});
		int[] b = {1,2,3};
		for(int item:b) {
			System.out.println(item);
		}
	}

//	練習
	@Test
	public void Test1() {
		Interger[] aa = new Interger[3];
		System.out.println(aa.length);
		List<Interger>  a = new ArrayList<>();
	}

	
	
	
	
	
	
}


