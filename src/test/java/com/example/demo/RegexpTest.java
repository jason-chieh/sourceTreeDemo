package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpTest {
	
//	11/7 ���W��F
	@Test
	public void regexpTest() {
//	    \�O����Ÿ�
		String str ="0989-325-378";
//		\�����W�s�b  d�N��Ʀr  w�N��a~z  A~Z 0~9
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d"; 
//      �L�X�ӥu�|�����\��\
		System.out.println(pattern);
//		�P�_�O�_�ŦX	
		System.out.println(str.matches(pattern));
//		�i�H�Y�g
//		String pattern2 = "\\d{4}-\\d{3}-\\d{3}"; 
		String pattern2 = "\\d{4}(-\\d{3}){2}"; 
		System.out.println(pattern2);
		System.out.println(str.matches(pattern2));
		System.out.println("============================");
		
	}
      
	@Test
	public void regexpTest2() {
		String str ="(02)-2521147";
		String pattern2 = "\\(\\d{2}\\)-\\d{7}"; //�榡:   (2��)8�� �]�A�p�A��   ���A�����ܤ]�n���L\\
		System.out.println(str.matches(pattern2));
		// �w�q���W�ƪ��Ҧ�
		
		String pattern = "[a-z]+";
		// �n�ǰt����J�r��
		String input = "hefdfgfgdgfdgdfgfgdfgfd";
		System.out.println(input.matches(pattern));
		
	}
//   �m�ߥ��q�ܸ��X
	@Test
	public void regexpTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�q�ܸ��X");
		String str = scan.next();
		String pattern1 = "\\(\\d{2}\\)-\\d{7}"; //�榡:   (2��)8�� �]�A�p�A��
		String pattern2 = "\\d{2}-\\d{7}";
		if(str.matches(pattern1) || str.matches(pattern2)) {
			System.out.println("�g");
		}else {
			System.out.println("���g");
		}
//		�o�̤����i�H�[�J���� �C�X�άO�K�X!!!!
		String pattern3 = "\\(\\d{2}\\)-(\\d{7}||\\d{8})";
		String pattern4 = "\\(\\d{2,3}\\)-\\d{7,8}";
		System.out.println(str.matches(pattern4));
		
	}
	
//  �������ˬd
	@Test
	public void homework() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�����Ҧr��");
		String id = scan.next();
		String pattern = "^[A-Z][1-2]\\d{8}";
		System.out.println(id.matches(pattern));
//		�ɤO�}��
		String pattern2 = "[CGI-Z](1||2)[0-9]{8}";
		System.out.println(id.matches(pattern2));
//		�S��r��
		String pattern3 = "^[A-Z^ABDEFH][1-2][0-9]{8}$";
		System.out.println(id.matches(pattern3));
		
	}
	

}
