package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;

public class FirstTrain {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		-----------------------------------------10/30�m��
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

//		-----------------------------------------10/31�m��
//		�G�i�� �K�i�� �Q���i��
		int q;
		long w;
		q = 103;
		System.out.println("�C�L103���� \t" + q);
		q = 0b111;
		System.out.println("�C�L0b111���� \t" + q);
		w = 022;
		System.out.println("�C�L022���� \t" + w);
		w = 0x2B;
		System.out.println("�C�L0x2B���� \t" + w);

		int money = 120;
		int yearMoney = money * 8 * 300;
		int yearSpent = 9000 * 12;
		int saveMoney = yearMoney - yearSpent;
		System.out.println("�@�~�i�H��" + yearMoney);
		System.out.println("�@�~�i�H��" + saveMoney);

		// �T���B��Ÿ�
		String xxx = "xxx";
		String yyy = "yyy";
		int xxxx = 5;
		int yyyy = 6;
		System.out.println(5 > 4 ? xxx : yyy);
		System.out.println(xxxx > yyyy ? "�諸" : "����");

//		���W�򻼴�
		int test, test1, value;
		test = test1 = 10;
		value = ++test * 10;
		System.out.println("���W��e��\t" + value);
		value = test1++ * 10;
		System.out.println("���W��e��\t" + value);

		System.out.println("test=" + test + "\t" + "test1=" + test1);
		
//		��L��J
		Scanner scan = new Scanner(System.in);
		int v,b ;
		String str1;
		v = scan.nextInt();
		b = scan.nextInt();
		str1 = scan.next();
		System.out.println(v+"\t"+b+"\t"+str1);
	}

}


