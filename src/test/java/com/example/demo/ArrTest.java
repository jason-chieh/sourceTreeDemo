package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArrTest {

	// 11/3�}�C�W��
	@Test
	public void arrayTest() {
		int[] a = new int[5];
		System.out.println(a.length);
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
//		�|�X�{�ýX�O�]�����O�O�����m
		System.out.println(a);
//		�ŧi�P�ɵ�����l��
		int[] b = { 1, 2, 3, 4 };
		System.out.println(b[1]);
	}

	// 11/3 �W��list
	@Test
	public void listTest() {
//		list�O����(interface)�L�knew �ت��O�w�q��k 
		List<String> c = new ArrayList<>();
//		list�O���ƧǪ��A�̷ӥ[�J�����ᶶ��
		c.add("A");
		c.add("b");
		c.add("c");
		c.add("d");
		System.out.println(c);
		System.out.println(c.size());
//		���O����
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
//		�Ωw�q���覡��list�Ȧ��O�P��list�o���׷|�Q�T�w�A����A�[�J��L��
		List<String> cc = List.of("a","b","c","d");
		List<String> ccc = Arrays.asList("1a","1b","1c","1d");
		System.out.println(cc);
		System.out.println(ccc);
//		-----------------------------------------------
//		��new ArrayList �N�i�H�ʺA�s�W�F���R��
		List<String> c1 = new ArrayList<>(List.of("a","b","c","d"));
		List<String> c2 = new ArrayList<>(Arrays.asList("1a","1b","1c","1d"));
		c1.add("adadadadad");
		c2.add("adadadadad");
		System.out.println(c1);
		System.out.println(c2);
	}
	
//	foreach�m��
	@Test
	public void foreachTest() {
		List<String> c = new ArrayList<>(List.of("a","b","c","d"));
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
		System.out.println("================================");
//		foreach�M��
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

//	�m��
	@Test
	public void Test1() {
		Interger[] aa = new Interger[3];
		System.out.println(aa.length);
		List<Interger>  a = new ArrayList<>();
	}

	
	
	
	
	
	
}


