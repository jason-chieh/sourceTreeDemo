package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;

public class FirstTrain {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		-----------------------------------------10/30練習
		int x = 5;
		System.out.println(x);
		System.out.print(x + "\n");
		System.out.println(x + 10);
		System.out.println(x);
		System.out.printf("x=%d", x);

		char a = 's';
		char aa = 97;
		System.out.println("\n" + "a=" + a + "\t aa=" + aa + "\n");
		System.out.println(aa);

		int y = 6;
		System.out.println(x < y);
		String str = " this is a string ";
		System.out.println(str);
		Integer xx = 5;
		System.out.println(xx);

//		-----------------------------------------10/31練習
//		二進位 八進位 十六進位
		int q;
		long w;
		q = 103;
		System.out.println("列印103的值 \t" + q);
		q = 0b111;
		System.out.println("列印0b111的值 \t" + q);
		w = 022;
		System.out.println("列印022的值 \t" + w);
		w = 0x2B;
		System.out.println("列印0x2B的值 \t" + w);

		int money = 120;
		int yearMoney = money * 8 * 300;
		int yearSpent = 9000 * 12;
		int saveMoney = yearMoney - yearSpent;
		System.out.println("一年可以賺" + yearMoney);
		System.out.println("一年可以賺" + saveMoney);

		// 三元運算符號
		String xxx = "xxx";
		String yyy = "yyy";
		int xxxx = 5;
		int yyyy = 6;
		System.out.println(5 > 4 ? xxx : yyy);
		System.out.println(xxxx > yyyy ? "對的" : "錯的");

//		遞增跟遞減
		int test, test1, value;
		test = test1 = 10;
		value = ++test * 10;
		System.out.println("遞增放前面\t" + value);
		value = test1++ * 10;
		System.out.println("遞增放前面\t" + value);

		System.out.println("test=" + test + "\t" + "test1=" + test1);
		
//		鍵盤輸入
		Scanner scan = new Scanner(System.in);
		int v,b ;
		String str1;
		v = scan.nextInt();
		b = scan.nextInt();
		str1 = scan.next();
		System.out.println(v+"\t"+b+"\t"+str1);
	}

}


