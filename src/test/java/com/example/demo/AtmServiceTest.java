package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.ifs.AtmService;
import com.example.demo.vo.AtmResponse;

@SpringBootTest
public class AtmServiceTest {

	@Autowired
	private AtmService atmService;
	
	@Test
	public void addInfoTest() {
		AtmResponse res = atmService.addInfo("123", "123");
		System.out.println(res.getRtnCode().getCode());
		System.out.println(res.getRtnCode().getMessage());
		System.out.println(res.getAtm().getAccount());
		System.out.println(res.getAtm().getPwd());
	}
	@Test
	public void getBalanceByAccount() {
		AtmResponse res = atmService.getBalanceByAccount("123", "123");
		System.out.println(res.getAtm().getBalance());
		
	}
	@Test
	public void updatePwd() {
		AtmResponse res = atmService.updatePwd("123", "123", "123123");
	}
	
	@Test
	public void deposit() {
		AtmResponse res = atmService.deposit("123", "123", 3000);
	}
	@Test
	public void withdraw() {
		AtmResponse res = atmService.withdraw("123", "123", 1500);
		
		System.out.println(res.getRtnCode().getCode());
		System.out.println(res.getRtnCode().getMessage());
	}
	
}
