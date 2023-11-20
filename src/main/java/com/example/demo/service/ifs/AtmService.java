package com.example.demo.service.ifs;

import com.example.demo.entity.Atm;
import com.example.demo.vo.AtmResponse;

public interface AtmService {
	
	public AtmResponse addInfo(String account,String pwd);
	
	public AtmResponse getBalanceByAccount(String account,String pwd);
	
	public AtmResponse updatePwd(String account,String oldPwd,String newPwd);
	
	public AtmResponse deposit(String account,String Pwd,int money);
	
	public AtmResponse withdraw(String account,String Pwd,int money);
	
}
