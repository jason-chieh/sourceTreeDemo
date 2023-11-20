package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PersonInfo;

@Repository
public interface PersonInfoDao extends JpaRepository<PersonInfo, String> {

//	這個是我們自己去定義的喔~ 自訂義方法!!!! city的c一定要大寫
	public List<PersonInfo> findByCity(String city);
	
	public List<PersonInfo> findByCityAndName(String city,String name);
	
	public List<PersonInfo> findByCityOrName(String city,String name);
	//-------------------------------------------------------------------------

	
	public List<PersonInfo> findByAgeGreaterThan(int age);
	
	public List<PersonInfo> findByAgeLessThanEqual(int age);
	
	public List<PersonInfo> findByAgeLessThanOrAgeGreaterThan(int age1, int age2);
	
	public List<PersonInfo> findTop3ByAgeBetweenOrderByAgeDesc(int age1, int age2);
	
	public List<PersonInfo> findByCityContaining(String city);
	
	public List<PersonInfo> findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age,String city);
}
