package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Menu;
import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.MenuDao;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.MenuService;


@SpringBootTest
public class MenuServiceTest {
	
	@Autowired
	private MenuService menuService;
//	@Autowired
//	private MenuDao menuDao;
	
//	新增單筆餐點
	@Test
	public void addMenuTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入餐點跟價錢");
		String menu = scan.next();
		int price = scan.nextInt();
		menuService.addMenu(new Menu(menu,price));
		System.out.println("新增的餐點是:"+menu+"價錢是:"+price);
	}
//	新增多筆餐點
	@Test
	public void addMenulist() {
		List<Menu> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("你可以輸入多筆餐點");
		int time = 0;
		while(time<2) {
			System.out.println("輸入餐點名稱");
			String name = scan.next();
			System.out.println("輸入餐點價錢");
			int price = scan.nextInt();
			list.add(new Menu(name,price));
			time++;
		}
//		列印出輸入的餐點價錢跟名稱
		for(Menu item:list) {
			String listname =item.getName();
			int listprice =item.getPrice();
			System.out.println(listname);
			System.out.println(listprice);
		}
		menuService.addMenuList(list);
	}
//	查詢特定餐點價格
	@Test
	public void findTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入想查詢的餐點名稱");
		String name = scan.next();
		menuService.findMenu(name);
	}
//查詢所有餐點價格
	@Test
	public void findall() {
		menuService.findAll();
	}
//修改餐點
	@Test
	public void update() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入更改的餐點名稱");
		String namebefore = scan.next();
		System.out.println("請輸入新的餐點名稱");
		String nameafter = scan.next();
		System.out.println("請輸入新的餐點價錢");
		int pricerafter = scan.nextInt();
		menuService.update(namebefore, nameafter, pricerafter);
	}
}
