package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpTest {
	
//	11/7 正規表達
	@Test
	public void regexpTest() {
//	    \是跳脫符號
		String str ="0989-325-378";
//		\不能單獨存在  d代表數字  w代表a~z  A~Z 0~9
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d"; 
//      印出來只會有兩條\條\
		System.out.println(pattern);
//		判斷是否符合	
		System.out.println(str.matches(pattern));
//		可以縮寫
//		String pattern2 = "\\d{4}-\\d{3}-\\d{3}"; 
		String pattern2 = "\\d{4}(-\\d{3}){2}"; 
		System.out.println(pattern2);
		System.out.println(str.matches(pattern2));
		System.out.println("============================");
		
	}
      
	@Test
	public void regexpTest2() {
		String str ="(02)-2521147";
		String pattern2 = "\\(\\d{2}\\)-\\d{7}"; //格式:   (2馬)8馬 包括小括號   有括號的話也要給他\\
		System.out.println(str.matches(pattern2));
		// 定義正規化的模式
		
		String pattern = "[a-z]+";
		// 要匹配的輸入字串
		String input = "hefdfgfgdgfdgdfgfgdfgfd";
		System.out.println(input.matches(pattern));
		
	}
//   練習打電話號碼
	@Test
	public void regexpTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入電話號碼");
		String str = scan.next();
		String pattern1 = "\\(\\d{2}\\)-\\d{7}"; //格式:   (2馬)8馬 包括小括號
		String pattern2 = "\\d{2}-\\d{7}";
		if(str.matches(pattern1) || str.matches(pattern2)) {
			System.out.println("讚");
		}else {
			System.out.println("不讚");
		}
//		這裡中間可以加入水管 七碼或是八碼!!!!
		String pattern3 = "\\(\\d{2}\\)-(\\d{7}||\\d{8})";
		String pattern4 = "\\(\\d{2,3}\\)-\\d{7,8}";
		System.out.println(str.matches(pattern4));
		
	}
	
//  身分證檢查
	@Test
	public void homework() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入身分證字號");
		String id = scan.next();
		String pattern = "^[A-Z][1-2]\\d{8}";
		System.out.println(id.matches(pattern));
//		暴力破解
		String pattern2 = "[CGI-Z](1||2)[0-9]{8}";
		System.out.println(id.matches(pattern2));
//		特殊字元
		String pattern3 = "^[A-Z^ABDEFH][1-2][0-9]{8}$";
		System.out.println(id.matches(pattern3));
		
	}
	

}
