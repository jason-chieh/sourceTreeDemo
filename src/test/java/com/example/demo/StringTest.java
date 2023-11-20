package com.example.demo;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Dog;

public class StringTest {

//	11/6號練習   字串表達
	@Test
	public void stringTest() {
//		會將字串放進字串池
		String str = "abc";
		String strr = "abc";
//		使用new的話會新增一個新的記憶體
		String str1 = new String("abc");
		System.out.println(str);
		System.out.println(str1);
		System.out.println("判斷記憶體位置");
		System.out.println(str==str1);
		System.out.println(str==strr);
		System.out.println("===========================");
//		字串裡面的數值比較是用equals
		System.out.println(str.equals(str1));
		System.out.println(str.equals(strr));
		String strrr = "ABC";
		System.out.println(str.equals(strrr));
//		忽略大小寫比較
		System.out.println(str.equalsIgnoreCase(strrr));
		
	}
//	判斷字串
	@Test
	public void stringTest1() {
		String str = "abc";
		String str1 = "  ";
		String str2 = "";
		System.out.println(str.length());
		System.out.println(str1.length());
		System.out.println(str2.length());
//		判斷空白 查看字串長度是否為0
		System.out.println("isEmpty"+str1.isEmpty());
		System.out.println("isEmpty"+str2.isEmpty());
		System.out.println("==================================");
//		判斷空白   裡面只要是沒東西包刮空白都會被判定是空
		System.out.println("isBlank"+str1.isBlank());
		System.out.println("isBlank"+str2.isBlank());
	}
	
//	判斷是否為串自串
	@Test
	public void stringTest2() {
		Dog dog = new Dog();
		String color = dog.getColor();
		System.out.println(color);
//		這邊一定要先判斷color是否為null
		if( color==null || color.isBlank()) {
			System.out.println("color是空字串");
		}else {
			System.out.println("color不是空字串");
		}
		System.out.println("==================================");
//		判斷是否有文字長度
		System.out.println(StringUtils.hasLength("  "));
//		判斷是否有文字
		System.out.println(StringUtils.hasText("  "));
		System.out.println("==================================");
		if(StringUtils.hasText(color)) {
			System.out.println("color有內容");
		}else {
			System.out.println("color沒內容");
		}
	}
//	字串小龍女字串尋找
	@Test
	public void train() {
		String story = "神鵰俠侶是楊過與小龍女的故事,喜歡小龍女，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		Scanner scan = new Scanner(System.in);
		int time =0;
		int x=0;
		String ans = scan.next();
//		for(;;) {
//			if(story.indexOf(ans,x)>=0) {
//				time++;
//				System.out.println("我在索引值"+story.indexOf(ans,x)+"找到"+ans);
//				x=story.indexOf(ans,x)+ans.length();
//			}else {
//				break;
//			}
//		}
		while(story.indexOf(ans,x)>=0) {
			time++;
			System.out.println("我在索引值"+story.indexOf(ans,x)+"找到"+ans);
			x=story.indexOf(ans,x)+ans.length();
		}
		System.out.println("總次數"+time);
	}
	
//	字串取代
	@Test
	public void replace(){
		String story = "神鵰俠侶是楊過與小龍女的故事,喜歡小龍女，我不喜歡小龍女的甲仙"+
					   "雖然小龍女在楊過眼中是清新脫俗";
		story = story.replace("小龍女", "小籠胞");
//		兩個都是取代全部但是all的有正規表達式  之後再說
		story = story.replaceAll("小龍女", "小籠胞");
		System.out.println(story);
	
	
	}
//	字串切割
	@Test
	public void split(){
		String story = "神鵰俠侶是楊過與小龍女的故事,喜歡小龍女,我不喜歡小龍女的甲仙"+
					   "雖然小龍女在楊過眼中是清新脫俗";
		String[] arr = story.split(",");
		for(String item:arr) {
			System.out.println(item);			
		}
		System.out.println("==================");
		String s1 = "abcd";
		String[] arr2 = s1.split("");
		for(String item:arr2) {
			System.out.println(item);			
		}
	
	}
//	字串刪除前後空白
	@Test
	public void trim(){
		String str = "abc def      ";
		String str1 = "    abc def";
		str = str.trim();
		str1 = str1.trim();
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.equals(str1));
	}
//	字串 抓取值區間 或是到字串的尾巴
	@Test
	public void substring(){
		String story = "神鵰俠侶是楊過與小龍女的故事";
		String subStr = story.substring(5);
		System.out.println(subStr);
		String subStr2 = story.substring(5,10);
		System.out.println(subStr2);
	}
//	字串buffer 不會新增額外的記憶體
	@Test
	public void stringBuffer(){
		StringBuffer sb = new StringBuffer("abc");
		sb.append("defg");
		sb.append("hij");
		System.out.println(sb);

	}
//	11/7字串練習找出最後一個a換成W
	@Test
	public void indexof(){
		String sb ="ABACADEF";
		int a = sb.lastIndexOf("A");
		System.out.println(a);
		String behind = sb.substring(a);
		System.out.println(behind);
		String cut = behind.replace("A","w");
		String front = sb.substring(0,4);
		sb  = front + cut;
		System.out.println(sb);
	} 
//	11/7  是否為回文
	@Test
	public void train1(){
		Scanner scan = new Scanner(System.in);
		String enter = scan.next();
		StringBuffer enterNum = new StringBuffer(enter);
		
		enterNum = enterNum.reverse();
		if(enter.equals(enterNum.toString())) {
			System.out.println("是回文寶貝");
		}else {
			System.out.println("不是");
		}
		
	}
//	11/7  dog練習 建構方法
	@Test
	public void list1(){
		Dog dogg = new Dog("lily","green",3);
		String name = dogg.getName();
		System.out.println(name);
	}
//	11/7類別呼叫    
	@Test
	public void list2(){
		Dog dog = new Dog();
		dog.setAttribuates1();   //一般的呼叫方法必須要先把類別new出來
		Dog.setAttribuates2();   //static方法的呼叫,可以直接呼叫出來
	}
}
