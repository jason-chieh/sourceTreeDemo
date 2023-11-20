package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;

@Repository
public interface MealDao extends JpaRepository<Meal, MealId> {

//	findTop數字:  限制搜尋結果回傳筆數   
	public List<Meal> findTop2ByName(String name);
//	findFirst數字:  下面這個跟上面是一樣的意思   
	public List<Meal> findFirst2ByName(String name);
	
	
//	排序大小  預設ASC  
//	ASC由小到大    DESC由大到下
	public List<Meal> findByNameOrderByPrice(String name);
	
	public List<Meal> findAllByOrderByPrice();
	
	public List<Meal> findAllByOrderByPriceDesc();
	
//	比較大小
//	1.大於 :GreaterThan  2.大於等於:GreaterThanEqual
//	3.小於 :LessThan  4.小於等於:LessThanEqual
	public List<Meal> findByPriceGreaterThan(int price);
	
//	兩個條件
	public List<Meal> findByNameAndPriceGreaterThan(String name ,int price);
	
//	包含 模糊搜尋  containing
	public List<Meal> findByNameContaining(String name);
//	模糊搜尋 兩個條件
	public List<Meal> findByNameContainingAndCookingstyleContaining(String name,String cooking_style);
 	
	
//	之間  有包含上界直
	public List<Meal> findByPriceBetween(int price1,int price2);
	
	public List<Meal> findByPriceBetweenOrderByPrice(int price1,int price2);
	
//	in 還有 Notin
	public List<Meal> findByPriceIn(List<Integer> priceList);
//	Notin
	public List<Meal> findByPriceNotIn(List<Integer> priceList);
	
}
