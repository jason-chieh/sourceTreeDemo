package com.example.demo.service.ifs;

import java.util.List;

import com.example.demo.entity.Grade;

public interface GradeService {
	
	public Grade addGrade(Grade grade);
	
	public List<Grade> addGradeList(List<Grade> grade);
	
	public void findName(String name);
	
	public void findAll();
	
	public void update(String id,int newPrice);
	
	
	
	public Grade update1(Grade grade);

}
