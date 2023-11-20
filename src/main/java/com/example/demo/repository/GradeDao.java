package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Grade;

@Repository
public interface GradeDao extends JpaRepository<Grade,String> {

	
}
