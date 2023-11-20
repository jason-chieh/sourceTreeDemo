package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Dog;

public class StringTest {

//	11/6���m��   �r���F
	@Test
	public void stringTest() {
//		�|�N�r���i�r���
		String str = "abc";
		String strr = "abc";
//		�ϥ�new���ܷ|�s�W�@�ӷs���O����
		String str1 = new String("abc");
		System.out.println(str);
		System.out.println(str1);
		System.out.println("�P�_�O�����m");
		System.out.println(str==str1);
		System.out.println(str==strr);
		System.out.println("===========================");
//		�r��̭����ƭȤ���O��equals
		System.out.println(str.equals(str1));
		System.out.println(str.equals(strr));
		String strrr = "ABC";
		System.out.println(str.equals(strrr));
//		�����j�p�g���
		System.out.println(str.equalsIgnoreCase(strrr));
		
	}
//	�P�_�r��
	@Test
	public void stringTest1() {
		String str = "abc";
		String str1 = "  ";
		String str2 = "";
		System.out.println(str.length());
		System.out.println(str1.length());
		System.out.println(str2.length());
//		�P�_�ť� �d�ݦr����׬O�_��0
		System.out.println("isEmpty"+str1.isEmpty());
		System.out.println("isEmpty"+str2.isEmpty());
		System.out.println("==================================");
//		�P�_�ť�   �̭��u�n�O�S�F��]��ťճ��|�Q�P�w�O��
		System.out.println("isBlank"+str1.isBlank());
		System.out.println("isBlank"+str2.isBlank());
	}
	
//	�P�_�O�_����ۦ�
	@Test
	public void stringTest2() {
		Dog dog = new Dog();
		String color = dog.getColor();
		System.out.println(color);
//		�o��@�w�n���P�_color�O�_��null
		if( color==null || color.isBlank()) {
			System.out.println("color�O�Ŧr��");
		}else {
			System.out.println("color���O�Ŧr��");
		}
		System.out.println("==================================");
//		�P�_�O�_����r����
		System.out.println(StringUtils.hasLength("  "));
//		�P�_�O�_����r
		System.out.println(StringUtils.hasText("  "));
		System.out.println("==================================");
		if(StringUtils.hasText(color)) {
			System.out.println("color�����e");
		}else {
			System.out.println("color�S���e");
		}
	}
//	�r��p�s�k�r��M��
	@Test
	public void train() {
		String story = "����L�Q�O���L�P�p�s�k���G��,���w�p�s�k�A�ڤ����w�p�s�k���ҥP�A���M�p�s�k�b���L�����O�M�s��U";
		Scanner scan = new Scanner(System.in);
		int time =0;
		int x=0;
		String ans = scan.next();
//		for(;;) {
//			if(story.indexOf(ans,x)>=0) {
//				time++;
//				System.out.println("�ڦb���ޭ�"+story.indexOf(ans,x)+"���"+ans);
//				x=story.indexOf(ans,x)+ans.length();
//			}else {
//				break;
//			}
//		}
		while(story.indexOf(ans,x)>=0) {
			time++;
			System.out.println("�ڦb���ޭ�"+story.indexOf(ans,x)+"���"+ans);
			x=story.indexOf(ans,x)+ans.length();
		}
		System.out.println("�`����"+time);
	}
	
//	�r����N
	@Test
	public void replace(){
		String story = "����L�Q�O���L�P�p�s�k���G��,���w�p�s�k�A�ڤ����w�p�s�k���ҥP"+
					   "���M�p�s�k�b���L�����O�M�s��U";
		story = story.replace("�p�s�k", "�pŢ�M");
//		��ӳ��O���N�������Oall�������W��F��  ����A��
		story = story.replaceAll("�p�s�k", "�pŢ�M");
		System.out.println(story);
	
	
	}
//	�r�����
	@Test
	public void split(){
		String story = "����L�Q�O���L�P�p�s�k���G��,���w�p�s�k,�ڤ����w�p�s�k���ҥP"+
					   "���M�p�s�k�b���L�����O�M�s��U";
		String[] arr = story.split(",");
		for(String item:arr) {
			System.out.println(item);			
		}
		System.out.println("==================");
		String s1 = "abcd";
		String[] arr2 = s1.split("");
		for(String item:arr2) {
			System.out.println(item);			
		}
	
	}
//	�r��R���e��ť�
	@Test
	public void trim(){
		String str = "abc def      ";
		String str1 = "    abc def";
		str = str.trim();
		str1 = str1.trim();
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.equals(str1));
	}
//	�r�� ����Ȱ϶� �άO��r�ꪺ����
	@Test
	public void substring(){
		String story = "����L�Q�O���L�P�p�s�k���G��";
		String subStr = story.substring(5);
		System.out.println(subStr);
		String subStr2 = story.substring(5,10);
		System.out.println(subStr2);
	}
//	�r��buffer ���|�s�W�B�~���O����
	@Test
	public void stringBuffer(){
		StringBuffer sb = new StringBuffer("abc");
		sb.append("defg");
		sb.append("hij");
		System.out.println(sb);

	}
//	11/7�r��m�ߧ�X�̫�@��a����W
	@Test
	public void indexof(){
		String sb ="ABACADEF";
		int a = sb.lastIndexOf("A");
		System.out.println(a);
		String behind = sb.substring(a);
		System.out.println(behind);
		String cut = behind.replace("A","w");
		String front = sb.substring(0,4);
		sb  = front + cut;
		System.out.println(sb);
	} 
//	11/7  �O�_���^��
	@Test
	public void train1(){
		Scanner scan = new Scanner(System.in);
		String enter = scan.next();
		StringBuffer enterNum = new StringBuffer(enter);
		
		enterNum = enterNum.reverse();
		if(enter.equals(enterNum.toString())) {
			System.out.println("�O�^���_��");
		}else {
			System.out.println("���O");
		}
		
	}
//	11/7  dog�m�� �غc��k
	@Test
	public void list1(){
		Dog dogg = new Dog("lily","green",3);
		String name = dogg.getName();
		System.out.println(name);
	}
//	11/7���O�I�s    
	@Test
	public void list2(){
		Dog dog = new Dog();
		dog.setAttribuates1();   //�@�몺�I�s��k�����n�������Onew�X��
		Dog.setAttribuates2();   //static��k���I�s,�i�H�����I�s�X��
	}
}
