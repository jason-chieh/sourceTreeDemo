package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.constants.RtnCode;
import com.example.demo.entity.Atm;
import com.example.demo.repository.AtmDao;
import com.example.demo.service.ifs.AtmService;
import com.example.demo.vo.AtmResponse;

@Service
public class AtmServiceImpl implements AtmService{

	@Autowired
	private AtmDao atmDao;

	@Override
	public AtmResponse addInfo(String account, String pwd) {
		if(!StringUtils.hasText(account) ||!StringUtils.hasText(pwd) ) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		if(atmDao.existsById(account)) {
			return new AtmResponse(null,RtnCode.ACCOUNT_EXISTED);
		}
//		他會幫你把密碼變成亂碼
		BCryptPasswordEncoder  encoder = new BCryptPasswordEncoder();
		Atm res = atmDao.save(new Atm(account,encoder.encode(pwd)));
		//不想被前台知道密碼
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse getBalanceByAccount(String account,String pwd) {
		if(!StringUtils.hasText(account)) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> op = atmDao.findById(account);
		if(op.isEmpty()) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);
		}
		Atm res = op.get();
		
		BCryptPasswordEncoder  encoder = new BCryptPasswordEncoder();
//		去資料庫抓有加密的密碼出來比對
		if(!encoder.matches(pwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);		
		}
		
//		只會取出帳號跟餘額因為密碼被我set成空了
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse updatePwd(String account, String oldPwd, String newPwd) {
		if(!StringUtils.hasText(account)||!StringUtils.hasText(oldPwd)||!StringUtils.hasText(newPwd)) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> op = atmDao.findById(account);
		if(op.isEmpty()) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);
		}
		Atm res = op.get();
		BCryptPasswordEncoder  encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(oldPwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);		
		}
		res.setPwd(encoder.encode(newPwd));
		atmDao.save(res);	
		res.setPwd("");
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse deposit(String account, String Pwd, int money) {
		if(!StringUtils.hasText(account)||!StringUtils.hasText(Pwd)|| money<=0) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> op = atmDao.findById(account);
		if(op.isEmpty()) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);
		}
		Atm res = op.get();
		BCryptPasswordEncoder  encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(Pwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);		
		}
		res.setBalance(res.getBalance()+money);
		atmDao.save(res);
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}

	@Override
	public AtmResponse withdraw(String account, String Pwd, int money) {
		if(!StringUtils.hasText(account)||!StringUtils.hasText(Pwd)|| money<=0) {
			return new AtmResponse(null,RtnCode.PARAM_ERROR);
		}
		Optional<Atm> op = atmDao.findById(account);
		if(op.isEmpty()) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);
		}
		Atm res = op.get();
		BCryptPasswordEncoder  encoder = new BCryptPasswordEncoder();
		if(!encoder.matches(Pwd, res.getPwd())) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_FOUND);		
		}
		
//		檢查餘額
		if(res.getBalance()<money) {
			return new AtmResponse(null,RtnCode.ACCOUNT_NOT_ENOUGH);	
		}
		res.setBalance(res.getBalance()-money);
		atmDao.save(res);	
		return new AtmResponse(res,RtnCode.SUCCESSFUL);
	}
	
	


	
}
