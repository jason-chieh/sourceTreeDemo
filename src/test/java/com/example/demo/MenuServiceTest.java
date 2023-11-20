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
	
//	�s�W�浧�\�I
	@Test
	public void addMenuTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�\�I�����");
		String menu = scan.next();
		int price = scan.nextInt();
		menuService.addMenu(new Menu(menu,price));
		System.out.println("�s�W���\�I�O:"+menu+"�����O:"+price);
	}
//	�s�W�h���\�I
	@Test
	public void addMenulist() {
		List<Menu> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("�A�i�H��J�h���\�I");
		int time = 0;
		while(time<2) {
			System.out.println("��J�\�I�W��");
			String name = scan.next();
			System.out.println("��J�\�I����");
			int price = scan.nextInt();
			list.add(new Menu(name,price));
			time++;
		}
//		�C�L�X��J���\�I������W��
		for(Menu item:list) {
			String listname =item.getName();
			int listprice =item.getPrice();
			System.out.println(listname);
			System.out.println(listprice);
		}
		menuService.addMenuList(list);
	}
//	�d�߯S�w�\�I����
	@Test
	public void findTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�Q�d�ߪ��\�I�W��");
		String name = scan.next();
		menuService.findMenu(name);
	}
//�d�ߩҦ��\�I����
	@Test
	public void findall() {
		menuService.findAll();
	}
//�ק��\�I
	@Test
	public void update() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J��諸�\�I�W��");
		String namebefore = scan.next();
		System.out.println("�п�J�s���\�I�W��");
		String nameafter = scan.next();
		System.out.println("�п�J�s���\�I����");
		int pricerafter = scan.nextInt();
		menuService.update(namebefore, nameafter, pricerafter);
	}
}
