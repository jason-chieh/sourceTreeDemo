package com.example.demo.service.ifs;

import java.util.List;

import com.example.demo.entity.Menu;

public interface MenuService {
	
	public void addMenu(Menu menu);
	
	public void addMenuList(List<Menu> menuList);
	
	public void findMenu(String name);
	
	public void findAll();
	
	public void update(String namebefore,String nameafter,int priceafter);
	
}
