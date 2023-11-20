package com.example.demo.service.ifs;

import java.util.List;

import com.example.demo.entity.PersonInfo;

public interface PersonInfoService {

	public PersonInfo addInfo(PersonInfo info);
	
	public List<PersonInfo> addInfoList(List<PersonInfo> infolist);
	
	public List<PersonInfo> addListInfo(List<PersonInfo> personInfo);
	
	public List<PersonInfo> findAll();
	
	public PersonInfo findId(String id);
	
}
