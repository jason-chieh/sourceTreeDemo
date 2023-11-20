package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;


@Service
public class PersonInfoImpl implements PersonInfoService {

	//@:annotation
	@Autowired
	private PersonInfoDao personinfoDao;

	@Override
	public PersonInfo addInfo(PersonInfo info) {
		
		String pattern = "[A-Za-z][1-2]\\d{8}";
		
		if(info.getId().matches(pattern)) {
			return personinfoDao.save(info);			
		}
		else {
			System.out.println("false");
			return null;
		}
	}
	
	
//	一次儲存多筆用list存
	@Override
	public List<PersonInfo> addInfoList(List<PersonInfo> infolist) {
		String pattern = "[A-Za-z]\\d+";
		for(PersonInfo item :infolist) {
			String id = item.getId();
			if(!id.matches(pattern) || !StringUtils.hasText(id)) {
				System.out.println("失敗");
				return null;
			}
		}
		return personinfoDao.saveAll(infolist);	
		
	}

//-----------------------------------------------------------------------以上是上課的
	
	
	@Override
	public List<PersonInfo> addListInfo(List<PersonInfo> infolist) {
		String pattern = "[A-Za-z]\\d{9}";
		for(PersonInfo item:infolist) {
			String id = item.getId();
			if(!id.matches(pattern) || id.isEmpty() || personinfoDao.existsById(id)) {
				return null;
			}
		}
		return personinfoDao.saveAll(infolist);
	}


	@Override
	public List<PersonInfo> findAll() {
		return personinfoDao.findAll();
	}


	@Override
	public PersonInfo findId(String id) {
		Optional<PersonInfo> personInfoOp = personinfoDao.findById(id);
		if(personInfoOp.isEmpty()) {
			return null;
		}
		return personInfoOp.get();
	}
	

}
