package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;

@Repository
public interface MealDao extends JpaRepository<Meal, MealId> {

//	findTop�Ʀr:  ����j�M���G�^�ǵ���   
	public List<Meal> findTop2ByName(String name);
//	findFirst�Ʀr:  �U���o�Ӹ�W���O�@�˪��N��   
	public List<Meal> findFirst2ByName(String name);
	
	
//	�ƧǤj�p  �w�]ASC  
//	ASC�Ѥp��j    DESC�Ѥj��U
	public List<Meal> findByNameOrderByPrice(String name);
	
	public List<Meal> findAllByOrderByPrice();
	
	public List<Meal> findAllByOrderByPriceDesc();
	
//	����j�p
//	1.�j�� :GreaterThan  2.�j�󵥩�:GreaterThanEqual
//	3.�p�� :LessThan  4.�p�󵥩�:LessThanEqual
	public List<Meal> findByPriceGreaterThan(int price);
	
//	��ӱ���
	public List<Meal> findByNameAndPriceGreaterThan(String name ,int price);
	
//	�]�t �ҽk�j�M  containing
	public List<Meal> findByNameContaining(String name);
//	�ҽk�j�M ��ӱ���
	public List<Meal> findByNameContainingAndCookingstyleContaining(String name,String cooking_style);
 	
	
//	����  ���]�t�W�ɪ�
	public List<Meal> findByPriceBetween(int price1,int price2);
	
	public List<Meal> findByPriceBetweenOrderByPrice(int price1,int price2);
	
//	in �٦� Notin
	public List<Meal> findByPriceIn(List<Integer> priceList);
//	Notin
	public List<Meal> findByPriceNotIn(List<Integer> priceList);
	
}
