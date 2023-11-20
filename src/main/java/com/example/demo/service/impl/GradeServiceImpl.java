package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Grade;
import com.example.demo.repository.GradeDao;
import com.example.demo.service.ifs.GradeService;

@Service
public class GradeServiceImpl implements GradeService{

	@Autowired
	private GradeDao gradeDao;
	
	@Override
	public Grade addGrade(Grade grade) {
		if(!StringUtils.hasText(grade.getName()) || grade.getGrade()<=0 ){
			return null;
		}
		if(gradeDao.existsById(grade.getName())) {
			return null;
		}
		return gradeDao.save(grade);
	}
	
	@Override
	public List<Grade> addGradeList(List<Grade> grade) {
		for(Grade item:grade) {
			if(!StringUtils.hasText(item.getName()) || item.getGrade()<=0 ){
				return null;
			}
		}
		return gradeDao.saveAll(grade);
	}
	
	@Override
	public void findName(String name) {
		Optional<Grade> gradeOp = gradeDao.findById(name);
		if(gradeOp.isEmpty()) {
			System.out.println("找不到寶貝");
			return;
		}
		System.out.println(gradeOp.get().getName()+"的成績是"+gradeOp.get().getGrade());
		
		
//		用三元符號表示
//		return gradeOp.isEmpty() ? null:gradeOp.get();
//		用orElseGet表示
//		return gradeOp.orElseGet(null);
	}

	@Override
	public void findAll() {
		List<Grade> list = gradeDao.findAll();
		for( Grade item:list) {
			System.out.println(item.getName());
			System.out.println(item.getGrade());
			
		}
	}


	@Override
	public void update(String id,int newPrice) {
		Optional<Grade> gradeOp = gradeDao.findById(id);
		if(gradeOp.isPresent()) {
			 Grade gradeUpdate = gradeOp.get();
		     gradeUpdate.setGrade(newPrice);
		     gradeDao.save(gradeUpdate);
		     System.out.println("更改成功");
		}else {
			System.out.println("找不到無法更改成績");
		}
		
	}

	@Override
	public Grade update1(Grade grade) {
		if(!StringUtils.hasText(grade.getName()) || grade.getGrade()<=0 ){
			return null;
		}
		if(!gradeDao.existsById(grade.getName())) {
			System.out.println("找不到");
			return null;
		}
		return gradeDao.save(grade);
	}
}
