package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;
import com.example.demo.repository.MealDao;
import com.example.demo.service.ifs.MealService;




@SpringBootTest
public class MealServiceTest {

	@Autowired
	private MealService mealservice;
	
	@Autowired
	private MealDao mealDao;
	
	@Test
	public void addMeal() {
		mealservice.addMeal(new Meal("beef","BBQ",180));
		mealservice.addMeal(new Meal("beef","fry",150));
		mealservice.addMeal(new Meal("pork","fried",220));
		mealservice.addMeal(new Meal("chicken","stew",220));
		mealservice.addMeal(new Meal("chicken","BBQ",260));
		mealservice.addMeal(new Meal("chicken","steam",520));
		mealservice.addMeal(new Meal("Apple","sugar",1520));
	}
	
	@Test
	public void addMealTest() {
//		name不符
		Meal result = mealservice.addMeal(new Meal("","bbq",180));
		Assert.isTrue(result==null,"add error");
//		cooking style 不符
		result=mealservice.addMeal(new Meal("pork","",180));
		Assert.isTrue(result==null,"add error");
//		price不符
		result=mealservice.addMeal(new Meal("pork","bbq",0));
		Assert.isTrue(result==null,"add error");
//		正常新增
		result=mealservice.addMeal(new Meal("pork","bbq",180));
		Assert.isTrue(result!=null,"add error");
//		新增已存在的
		result=mealservice.addMeal(new Meal("beef","BBQ",180));
		Assert.isTrue(result==null,"add error");
//		刪除資料
//		mealDao.deleteById(new MealId("beef","bbq"));
	}
	
//	限制撈出來的筆數
	@Test
	public void LimiTest() {
		List<Meal> res = mealDao.findFirst2ByName("chicken");
		System.out.println(res.size());
		for(Meal item:res) {
			System.out.println(item.getCooking_style());
		}
		Assert.isTrue(res.size()==2,"find limit error");
	}
	
//	排序
	@Test
	public void OderByPrice() {
//		找尋chicken並把價格小排到大
//		List<Meal> res  = mealDao.findByNameOrderByPrice("chicken");
//		把所有價格有小排到大
//		List<Meal> res  = mealDao.findAllByOrderByPrice();
//		價格大到小到小
		List<Meal> res  = mealDao.findAllByOrderByPriceDesc();
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCooking_style()+item.getPrice());
		}
	}
	
//	比大小
	@Test
	public void compare() {
//		一個條件
//		List<Meal> res  = mealDao.findByPriceGreaterThan(200);
//		兩個條件
		List<Meal> res  = mealDao.findByNameAndPriceGreaterThan("chicken",230);
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCooking_style()+item.getPrice());
		}
	}
	
//	模糊搜尋
	@Test
	public void containing() {
//		搜尋一個
//		List<Meal> res  = mealDao.findByNameContaining("e");
//		搜尋多筆
		List<Meal> res  = mealDao.findByNameContainingAndCookingstyleContaining("e","b");
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCooking_style()+item.getPrice());
		}
	}
	
//	之間
	@Test
	public void  between() {
		List<Meal> res  = mealDao.findByPriceBetween(120,500);
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCooking_style()+item.getPrice());
		}
	}
//	in
	@Test
	public void inTest() {
		List<Meal> res  = mealDao.findByPriceIn(new ArrayList<>(List.of(100,200,150,180,1520)));
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCooking_style()+item.getPrice());
		}
	}
//	notin
	@Test
	public void notinTest() {
		List<Meal> res  = mealDao.findByPriceNotIn(new ArrayList<>(List.of(180,1520)));
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCooking_style()+item.getPrice());
		}
	}
	
}
