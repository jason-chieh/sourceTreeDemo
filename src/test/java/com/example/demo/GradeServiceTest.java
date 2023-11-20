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
	

	
//	新增單筆分數
	@Test
	public void addGrade() {
		//name不符合
		Grade result = gradeservice.addGrade(new Grade("",97));
		Assert.isTrue(result==null,"add error");
		//price=0
		result = gradeservice.addGrade(new Grade("小美",0));
		Assert.isTrue(result==null,"add error");
		//正常可以新增
		result = gradeservice.addGrade(new Grade("小華",98));
		Assert.isTrue(result!=null,"add error");
		//新增已存在的
		result = gradeservice.addGrade(new Grade("小美",74));
		Assert.isTrue(result==null,"add error");
		//刪除測試資料
		gradeDao.deleteById("小美123");
	}
	
//	新增多比分數
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
		System.out.println("新增成功兩筆");
	}
	
//	尋找單筆
	@Test
	public void findName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入姓名查詢成績");
		String name = scan.next();
		gradeservice.findName(name);
	}
	
//	尋找全班成績
	@Test
	public void findAll() {
		gradeservice.findAll();
	}
	
//尋找特定姓名更改他的成績
	@Test
	public void update() {
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入姓名即要更改的成績");
		String id = scan.next();
		int newPrice= scan.nextInt();
		gradeservice.update(id, newPrice);
	}
	
	@Test
	public void update1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入姓名即要更改的成績");
		String id = scan.next();
		int newPrice= scan.nextInt();
		gradeservice.update1(new Grade(id, newPrice));
	}
	
	@Test
	public void update2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入姓名即要更改的成績");
		String id = scan.next();
		int newPrice= scan.nextInt();
		gradeservice.update1(new Grade(id, newPrice));
	}
	
	@Test
	public void update3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入姓名即要更改的成績");
		String id = scan.next();
		int newPrice= scan.nextInt();
		gradeservice.update1(new Grade(id, newPrice));
	}
}
