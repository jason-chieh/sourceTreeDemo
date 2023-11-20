package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Grade;
import com.example.demo.repository.GradeDao;
import com.example.demo.service.ifs.GradeService;

@SpringBootTest
public class GradeServiceTest {
	
	@Autowired
	private GradeService gradeservice;
	
	@Autowired
	private GradeDao gradeDao;
	

	
//	�s�W�浧����
	@Test
	public void addGrade() {
		//name���ŦX
		Grade result = gradeservice.addGrade(new Grade("",97));
		Assert.isTrue(result==null,"add error");
		//price=0
		result = gradeservice.addGrade(new Grade("�p��",0));
		Assert.isTrue(result==null,"add error");
		//���`�i�H�s�W
		result = gradeservice.addGrade(new Grade("�p��",98));
		Assert.isTrue(result!=null,"add error");
		//�s�W�w�s�b��
		result = gradeservice.addGrade(new Grade("�p��",74));
		Assert.isTrue(result==null,"add error");
		//�R�����ո��
		gradeDao.deleteById("�p��123");
	}
	
//	�s�W�h�����
	@Test
	public void addlist() {
		Scanner scan = new Scanner(System.in);
		List<Grade> grade = new ArrayList<>();
		int time = 0;
		while(time<2) {
			String name = scan.next();
			int score = scan.nextInt(); 
			grade.add(new Grade(name,score));
			time++;
		}
		gradeservice.addGradeList(grade);
		System.out.println("�s�W���\�ⵧ");
	}
	
//	�M��浧
	@Test
	public void findName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�m�W�d�ߦ��Z");
		String name = scan.next();
		gradeservice.findName(name);
	}
	
//	�M����Z���Z
	@Test
	public void findAll() {
		gradeservice.findAll();
	}
	
//�M��S�w�m�W���L�����Z
	@Test
	public void update() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��J�m�W�Y�n��諸���Z");
		String id = scan.next();
		int newPrice= scan.nextInt();
		gradeservice.update(id, newPrice);
	}
	
	@Test
	public void update1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��J�m�W�Y�n��諸���Z");
		String id = scan.next();
		int newPrice= scan.nextInt();
		gradeservice.update1(new Grade(id, newPrice));
	}
	
	@Test
	public void update2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��J�m�W�Y�n��諸���Z");
		String id = scan.next();
		int newPrice= scan.nextInt();
		gradeservice.update1(new Grade(id, newPrice));
	}
	
	@Test
	public void update3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��J�m�W�Y�n��諸���Z");
		String id = scan.next();
		int newPrice= scan.nextInt();
		gradeservice.update1(new Grade(id, newPrice));
	}
}
