package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.Meal;
import com.example.demo.entity.PersonInfo;
import com.example.demo.repository.PersonInfoDao;
import com.example.demo.service.ifs.PersonInfoService;


@SpringBootTest
public class PersonInfoServiceTest {
	
	@Autowired
	private PersonInfoService personinfoService;
	
	@Autowired
	private PersonInfoDao personInfoDao;
	
	
	@Test
	public void addInfoTest() {
		
		personinfoService.addInfo(new PersonInfo("z124741021","12313",18,"tainan"));	
	}
	@Test
	public void addInfoTest2() {
//		新增正常多筆
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("x1","test",30,"taipei"));
		list.add(new PersonInfo("y1","test1",30,"tainan"));
		personinfoService.addInfoList(list);
	}
	
	@Test
	public void daoTest() {
		List<PersonInfo> list = new ArrayList<>();
		list.add(new PersonInfo("v124741021","xxkii",19,"tainan"));
		list.add(new PersonInfo("f124741021","kxxii",20,"tainan"));
		list.add(new PersonInfo("g124741021","xxkii",19,"tainan"));
		list.add(new PersonInfo("r124741021","kxxii",20,"tainan"));
		personInfoDao.saveAll(list);
	}
	@Test
	public void findTest() {
		Optional<PersonInfo> infoOp = personInfoDao.findById("k124741021");
		if(infoOp.isEmpty()) {
			System.out.println("沒找到");
			return;
		}
		System.out.println(infoOp.get().getName());
	}
	@Test
	public void findall() {
		List<PersonInfo> list = personInfoDao.findAll();
		System.out.println(list);
		for(PersonInfo item:list) {
			System.out.println(item.getName());
		}
	}
	@Test
	public void daofind() {
		boolean result = personInfoDao.existsById("k124741021");
		System.out.println(result);
	}
//	自訂義名稱!!!!!
	@Test
	public void self() {
//		List<PersonInfo> result = personInfoDao.findByCity("tainan");
//		List<PersonInfo> result = personInfoDao.findByCityAndName("tainan", "xxkii");
		List<PersonInfo> result = personInfoDao.findByCityOrName("taipei", "xxkii");
		System.out.println(result.size());
		for(PersonInfo item:result ) {
			System.out.println(item.getName());
		}
	}
	
	//--------------------------------------------------以上是上課的
//		1.創建資訊
	@Test
	public void addList() {
		List<PersonInfo> infolist = new ArrayList<>();
		infolist.add(new PersonInfo("R333333333","小明",23,"taipei"));
		infolist.add(new PersonInfo("W444444444","小王",25,"tainan"));
		List<PersonInfo> list = personinfoService.addListInfo(infolist);
		Assert.isTrue(list!=null,"addlist error");
		for(PersonInfo item:list) {
			System.out.println("id:"+item.getId()+"name:"+item.getName()+"age:"+item.getAge()+"city:"+item.getCity());
		}
	}
//	2.取得所有人資訊
	@Test
	public void finAll() {
		List<PersonInfo> list = personinfoService.findAll();
		for(PersonInfo item:list) {
			System.out.println("id:"+item.getId()+"name:"+item.getName()+"age:"+item.getAge()+"city:"+item.getCity());
		}
	}
//	3.透過id取得個人資訊
	@Test
	public void findId() {
		String id = "R222222222";
		PersonInfo personinfo = personinfoService.findId(id);
		Assert.isTrue(personinfo!=null,"addlist error");
		System.out.println("id:"+personinfo.getId()+"name:"+personinfo.getName()+"age:"+personinfo.getAge()+"city:"+personinfo.getCity());
	}
//	4.找出年紀大於輸入的個人資料
	@Test
	public void findByAge() {
		List<PersonInfo> res  = personInfoDao.findByAgeGreaterThan(19);
		for(PersonInfo item:res) {
			System.out.println(item.getId()+item.getName()+item.getAge()+item.getCity());
		}
	}
//	5.找出年紀小於等於輸入的個人資料
	@Test
	public void findByAgeSmall() {
		List<PersonInfo> res  = personInfoDao.findByAgeLessThanEqual(20);
		for(PersonInfo item:res) {
			System.out.println(item.getId()+item.getName()+item.getAge()+item.getCity());
		}
	}
//	6.找出年紀小於輸入 或是大於輸入 的個人資料
	@Test
	public void findByAgeLessThanOrAgeGreaterThan() {
		List<PersonInfo> res  = personInfoDao.findByAgeLessThanOrAgeGreaterThan(20,25);
		for(PersonInfo item:res) {
			System.out.println(item.getId()+item.getName()+item.getAge()+item.getCity());
		}
	}
//	7.找出年紀小於輸入 或是大於輸入 的個人資料
	@Test
	public void findTop3ByAgeBetweenOrderByAgeDesc() {
		List<PersonInfo> res  = personInfoDao.findTop3ByAgeBetweenOrderByAgeDesc(19,25);
		for(PersonInfo item:res) {
			System.out.println(item.getId()+item.getName()+item.getAge()+item.getCity());
		}
	}
//	8.找出 city包含特定字的個人資料
	@Test
	public void findByCityContaining() {
		List<PersonInfo> res  = personInfoDao.findByCityContaining("n");
		for(PersonInfo item:res) {
			System.out.println(item.getId()+item.getName()+item.getAge()+item.getCity());
		}
	}
//	9.找出 找出年紀大於輸入條件以及city 包含某個特定字的所有人資訊 大到小
	@Test
	public void findByAgeGreaterThanAndCityContainingOrderByAgeDesc() {
		List<PersonInfo> res  = personInfoDao.findByAgeGreaterThanAndCityContainingOrderByAgeDesc(19,"n");
		for(PersonInfo item:res) {
			System.out.println(item.getId()+item.getName()+item.getAge()+item.getCity());
		}
	}
	
}
