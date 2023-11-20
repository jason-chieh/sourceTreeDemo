package com.example.demo;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	
	
	@Test
	public void ifTest() {
		int a = 5 ;
		if(a>5) {
			System.out.println("=========");
		}else {
			System.out.println("+++++++++++");
		}
	}
	
	@Test
	public void ifTest1() {
		int a = 5 ;
		if(a>5) {
			System.out.println("=========");
		}else {
			System.out.println("+++++++++++");
		}
	}
	
	@Test
	public void ifTest2() {
		int x ;
		double b =95/10.0;
		System.out.println(b);
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		if(x>0 && x<40) {
			System.out.println("薪水要*0.8");
		}else if(x==40) {
			System.out.println("薪水正常");
		}else if(x>40 && x<=50) {
			System.out.println("薪水正常*1.2");
		}else if(x>50) {
			System.out.println("薪水正常*1.8");
		}
	}
//	輸入是字串
	@Test
	public void ifTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入字");
		String a = scan.next();
		System.out.println("輸入的文字是:"+a);
	}
//	輸入是整行
	@Test
	public void ifTest4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入字");
		String a = scan.nextLine();
		System.out.println("輸入的文字是:"+a);
	}
	
//	輸入是數字
	@Test
	public void ifTest5() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入字");
		int a = scan.nextInt();
		System.out.println("輸入的文字是:"+a);
	}
	
//	switch 應用
	@Test
	public void ifTest6() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入成績");
		int a = scan.nextInt();
		switch(a/10) {
			case 10:
				System.out.println("你的成績是A+");
				break;
			case 9:
				System.out.println("你的成績是A");
				break;
			case 8:
				System.out.println("你的成績是B+");
				break;
			case 7:
				System.out.println("你的成績是B");
				break;
			default:
				System.out.println("????????");
		}
	}
//	11/1回家功課星期幾是星期幾  %s是字串   %d是數字  
	@Test
	public void homework() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入今天星期幾");
		String today = scan.next();
		
		System.out.println("請輸入幾天之後");
		Scanner scan1 = new Scanner(System.in);
		int after = scan1.nextInt();
		int todayNum; 
		
		switch(today) {
		case "一":
			todayNum=1;
			break;
		case "二":
			todayNum=2;
			break;
		case "三":
			todayNum=3;
			break;
		case "四":
			todayNum=4;
			break;
		case "五":
			todayNum=5;
			break;
		case "六":
			todayNum=6;
			break;
		default:
			todayNum=7;
		}
		
		int total = todayNum+after;
		
		switch(total%7) {
			case 1:
				System.out.println("今天是星期"+today+after+"天後是星期一");
				break;
			case 2:
				System.out.println("今天是星期"+today+after+"天後是星期二");
				break;
			case 3:
				System.out.println("今天是星期"+today+after+"天後是星期三");
				break;
			case 4:
				System.out.println("今天是星期"+today+after+"天後是星期四");
				break;
			case 5:
				System.out.println("今天是星期"+today+after+"天後是星期五");
				break;
			case 6:
				System.out.println("今天是星期"+today+after+"天後是星期六");
				break;
			default:
				System.out.println("今天是星期"+today+after+"天後是星期日");
		}
		
//		製作一個方法
//		public String (方法自訂義名稱)(宣告資料型態(ex:int) after) {
//			String weekday ="";
//			switch(after) {
//			case 0:
//				weekday = "你好";
//				break;
//			}
//			return weekday;
//		}
		
		
	}
	
	
//	while練習 1加到10
	@Test
	public void ifTest7() {
		int sum = 0;
		int x =0;
		while(x<10) {
			sum +=x;
			x++;
		}
		System.out.println(sum);
	}
//	for練習 1加到10   
	@Test
	public void ifTest8() {
		int sum = 0;
		
		for(int i=1;i<10;i++) {
			System.out.println("第"+i+"個");
			sum +=i;
		}
		System.out.println(sum);
	}
	
//	do while練習 1加到10   
	@Test
	public void ifTest9() {
		int sum = 0;
		int i = 0;
		do {
			sum +=i;
			i++;
		}while(i < 10);
		System.out.println(sum);
	}
	
//	java猜數字  
	@Test
	public void ifTest10() {
		int randomNum = (int)(Math.random()*100)+1;
//		另外一種表現方法 double random = Math.random()*(99-20+1)+20  99跟20分別為上限跟下限值
//		 			int random =(int)(Math.random()*(99-20+1))+20 
//		---------------------------------------------
//		Random ran = new Random(); 
//		int a = ran.nextInt(x);  x值是最大值  假如是55 就是0~55的隨機數 你要1~55的話自己+1
//		另外一種random數的方法切記要import random在最上面
		int big = 100;
		int small = 0;
		int playTime = 0;
		System.out.println("請猜數字共8次,0~100");
		
			while(playTime<8) {
				Scanner scan = new Scanner(System.in);
				int guess =scan.nextInt();
				if(guess>randomNum && big>=guess) {
					big = guess;
					System.out.println("猜錯了範圍是"+small+"~"+big);
				}else if(guess<randomNum && small<=guess) {
					small =guess;
					System.out.println("猜錯了範圍是"+small+"~"+big);
				}else if(guess>big || guess<small) {
					System.out.println("你輸出超範圍了範圍是"+small+"~"+big);
				}else if(guess==randomNum) {
					System.out.println("恭喜你猜對了你猜了"+(playTime+1)+"次");
					break;
				}
				playTime++;
				System.out.println("你已經猜了"+playTime+"次");
			}
	}
	
// chicken and rabbit   
	@Test
	public void ifTest11() {		
		int rabbit;
//		假設雞0隻
		int chicken = 0;  
		while(true) {
			rabbit = 35-chicken;
			if(chicken*2+rabbit*4==100) {
				System.out.printf("總共有%2d隻雞,%2d隻兔子",chicken,rabbit);
				break;
			}
			chicken+=1;
		}

	}	

//陣列應用設定數值
	@Test
	public void arr() {
		double average;
		double total = 0;
		double[] apple = new double[5];
		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt(); 
		apple[0]=scan.nextInt();;
		apple[1]=scan.nextInt();;
		apple[2]=scan.nextInt();;
		apple[3]=scan.nextInt();;
		apple[4]=scan.nextInt();;
		
		for(int i =0;i<5; i++) {
			total += apple[i];
			System.out.println((int)apple[i]);
		}
		average = total/5;
		System.out.printf("%5.2f",average);

	}	

// 11/2回家自己練習猜數字精簡版
		@Test
		public void ifTest13() {		
			int big = 99;
			int small = 1;
			int randomNum = (int)(Math.random()*(99-1+1))+1;
			Scanner scan = new Scanner(System.in);
			for(;;) {
				System.out.printf("請輸入猜測的數字範圍%d~%d \n",small,big);
				int guess = scan.nextInt();	
				if(guess<small||guess>big) {
//					System.out.println("超出範圍了拉");
					continue;
				}else if(guess==randomNum){
					System.out.println("猜對拉");
					break;
				}else if(guess>randomNum) {
					big = guess;
				}else if(guess<randomNum) {
					small = guess;
				}
			}

		}
		
		// 測試
		@Test
		public void ifTest14() {		
			double random = Math.random()*(99-20+1)+20;
			System.out.println(random);
		}
		
		//   11/3上課講陣列
		@Test
		public void ifTest15() {		
			String[] b = new String[10];
//			陣列宣告的長度固定 例如我要給他10 就要這樣寫 String[] b = new String[10];
			
		}



}
