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
			System.out.println("�S���");
			return;
		}
		System.out.println("�j�M���:"+MenuOp.get().getName());
		System.out.println("����:"+MenuOp.get().getPrice());
	}
	@Override
	public void findAll() {
		List<Menu> list = menuDao.findAll();
		for(Menu item: list) {
			System.out.println("���W��:"+item.getName());
			System.out.println("������"+item.getPrice());
		}
	}
	
	@Override
	public void update(String namebefore,String nameafter,int priceafter) {
		Optional<Menu> menuOp = menuDao.findById(namebefore);
		if(menuOp.isEmpty()) {
			System.out.println("��p�䤣���Ƥ������");
			return;
		}
		Menu menuupdate = menuOp.get();
		menuDao.delete(menuupdate);
		menuupdate.setName(nameafter);
		menuupdate.setPrice(priceafter);
		menuDao.save(menuupdate);
		
		System.out.println("��s�᪺�W�٬�:"+nameafter);
		System.out.println("��s�᪺������:"+priceafter);
		
		
	}
	
	

}
