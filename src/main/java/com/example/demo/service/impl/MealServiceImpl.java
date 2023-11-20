package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;
import com.example.demo.repository.MealDao;
import com.example.demo.service.ifs.MealService;

@Service
public class MealServiceImpl implements MealService {

	@Autowired
	private MealDao mealDao;
	
	@Override
	public Meal addMeal(Meal meal) {
		if(!StringUtils.hasText(meal.getName()) || meal.getPrice()<=0||
				!StringUtils.hasText(meal.getCooking_style())	){
			return null;
		}
		if(mealDao.existsById(new MealId(meal.getName(),meal.getCooking_style()))) {
			return null;
		}
		return mealDao.save(meal);
	}

	@Override
	public Meal findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
