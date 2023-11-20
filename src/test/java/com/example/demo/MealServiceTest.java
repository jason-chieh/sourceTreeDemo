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
//		name����
		Meal result = mealservice.addMeal(new Meal("","bbq",180));
		Assert.isTrue(result==null,"add error");
//		cooking style ����
		result=mealservice.addMeal(new Meal("pork","",180));
		Assert.isTrue(result==null,"add error");
//		price����
		result=mealservice.addMeal(new Meal("pork","bbq",0));
		Assert.isTrue(result==null,"add error");
//		���`�s�W
		result=mealservice.addMeal(new Meal("pork","bbq",180));
		Assert.isTrue(result!=null,"add error");
//		�s�W�w�s�b��
		result=mealservice.addMeal(new Meal("beef","BBQ",180));
		Assert.isTrue(result==null,"add error");
//		�R�����
//		mealDao.deleteById(new MealId("beef","bbq"));
	}
	
//	����X�Ӫ�����
	@Test
	public void LimiTest() {
		List<Meal> res = mealDao.findFirst2ByName("chicken");
		System.out.println(res.size());
		for(Meal item:res) {
			System.out.println(item.getCooking_style());
		}
		Assert.isTrue(res.size()==2,"find limit error");
	}
	
//	�Ƨ�
	@Test
	public void OderByPrice() {
//		��Mchicken�ç����p�ƨ�j
//		List<Meal> res  = mealDao.findByNameOrderByPrice("chicken");
//		��Ҧ����榳�p�ƨ�j
//		List<Meal> res  = mealDao.findAllByOrderByPrice();
//		����j��p��p
		List<Meal> res  = mealDao.findAllByOrderByPriceDesc();
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCooking_style()+item.getPrice());
		}
	}
	
//	��j�p
	@Test
	public void compare() {
//		�@�ӱ���
//		List<Meal> res  = mealDao.findByPriceGreaterThan(200);
//		��ӱ���
		List<Meal> res  = mealDao.findByNameAndPriceGreaterThan("chicken",230);
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCooking_style()+item.getPrice());
		}
	}
	
//	�ҽk�j�M
	@Test
	public void containing() {
//		�j�M�@��
//		List<Meal> res  = mealDao.findByNameContaining("e");
//		�j�M�h��
		List<Meal> res  = mealDao.findByNameContainingAndCookingstyleContaining("e","b");
		for(Meal item:res) {
			System.out.println(item.getName()+item.getCooking_style()+item.getPrice());
		}
	}
	
//	����
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
