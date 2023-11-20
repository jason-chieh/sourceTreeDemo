package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Menu;
import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.MenuDao;
import com.example.demo.service.ifs.MenuService;


@Service
public class MenuServiceImpl implements MenuService {
	
	//@:annotation
	@Autowired
	private MenuDao menuDao;
	
	@Override
	public void addMenu(Menu menu) {
		menuDao.save(menu);
		
	}

	@Override
	public void addMenuList(List<Menu> menuList) {
		menuDao.saveAll(menuList);	
	}
	
	@Override
	public void findMenu(String name) {
		Optional<Menu> MenuOp = menuDao.findById(name);
		if(MenuOp.isEmpty()) {
			System.out.println("沒找到");
			return;
		}
		System.out.println("搜尋菜單:"+MenuOp.get().getName());
		System.out.println("價錢:"+MenuOp.get().getPrice());
	}
	@Override
	public void findAll() {
		List<Menu> list = menuDao.findAll();
		for(Menu item: list) {
			System.out.println("菜單名稱:"+item.getName());
			System.out.println("菜單價格"+item.getPrice());
		}
	}
	
	@Override
	public void update(String namebefore,String nameafter,int priceafter) {
		Optional<Menu> menuOp = menuDao.findById(namebefore);
		if(menuOp.isEmpty()) {
			System.out.println("抱歉找不到資料不能替換");
			return;
		}
		Menu menuupdate = menuOp.get();
		menuDao.delete(menuupdate);
		menuupdate.setName(nameafter);
		menuupdate.setPrice(priceafter);
		menuDao.save(menuupdate);
		
		System.out.println("更新後的名稱為:"+nameafter);
		System.out.println("更新後的價錢為:"+priceafter);
		
		
	}
	
	

}
