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
			System.out.println("�~���n*0.8");
		}else if(x==40) {
			System.out.println("�~�����`");
		}else if(x>40 && x<=50) {
			System.out.println("�~�����`*1.2");
		}else if(x>50) {
			System.out.println("�~�����`*1.8");
		}
	}
//	��J�O�r��
	@Test
	public void ifTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�r");
		String a = scan.next();
		System.out.println("��J����r�O:"+a);
	}
//	��J�O���
	@Test
	public void ifTest4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�r");
		String a = scan.nextLine();
		System.out.println("��J����r�O:"+a);
	}
	
//	��J�O�Ʀr
	@Test
	public void ifTest5() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J�r");
		int a = scan.nextInt();
		System.out.println("��J����r�O:"+a);
	}
	
//	switch ����
	@Test
	public void ifTest6() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���Z");
		int a = scan.nextInt();
		switch(a/10) {
			case 10:
				System.out.println("�A�����Z�OA+");
				break;
			case 9:
				System.out.println("�A�����Z�OA");
				break;
			case 8:
				System.out.println("�A�����Z�OB+");
				break;
			case 7:
				System.out.println("�A�����Z�OB");
				break;
			default:
				System.out.println("????????");
		}
	}
//	11/1�^�a�\�ҬP���X�O�P���X  %s�O�r��   %d�O�Ʀr  
	@Test
	public void homework() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���ѬP���X");
		String today = scan.next();
		
		System.out.println("�п�J�X�Ѥ���");
		Scanner scan1 = new Scanner(System.in);
		int after = scan1.nextInt();
		int todayNum; 
		
		switch(today) {
		case "�@":
			todayNum=1;
			break;
		case "�G":
			todayNum=2;
			break;
		case "�T":
			todayNum=3;
			break;
		case "�|":
			todayNum=4;
			break;
		case "��":
			todayNum=5;
			break;
		case "��":
			todayNum=6;
			break;
		default:
			todayNum=7;
		}
		
		int total = todayNum+after;
		
		switch(total%7) {
			case 1:
				System.out.println("���ѬO�P��"+today+after+"�ѫ�O�P���@");
				break;
			case 2:
				System.out.println("���ѬO�P��"+today+after+"�ѫ�O�P���G");
				break;
			case 3:
				System.out.println("���ѬO�P��"+today+after+"�ѫ�O�P���T");
				break;
			case 4:
				System.out.println("���ѬO�P��"+today+after+"�ѫ�O�P���|");
				break;
			case 5:
				System.out.println("���ѬO�P��"+today+after+"�ѫ�O�P����");
				break;
			case 6:
				System.out.println("���ѬO�P��"+today+after+"�ѫ�O�P����");
				break;
			default:
				System.out.println("���ѬO�P��"+today+after+"�ѫ�O�P����");
		}
		
//		�s�@�@�Ӥ�k
//		public String (��k�ۭq�q�W��)(�ŧi��ƫ��A(ex:int) after) {
//			String weekday ="";
//			switch(after) {
//			case 0:
//				weekday = "�A�n";
//				break;
//			}
//			return weekday;
//		}
		
		
	}
	
	
//	while�m�� 1�[��10
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
//	for�m�� 1�[��10   
	@Test
	public void ifTest8() {
		int sum = 0;
		
		for(int i=1;i<10;i++) {
			System.out.println("��"+i+"��");
			sum +=i;
		}
		System.out.println(sum);
	}
	
//	do while�m�� 1�[��10   
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
	
//	java�q�Ʀr  
	@Test
	public void ifTest10() {
		int randomNum = (int)(Math.random()*100)+1;
//		�t�~�@�ت�{��k double random = Math.random()*(99-20+1)+20  99��20���O���W����U����
//		 			int random =(int)(Math.random()*(99-20+1))+20 
//		---------------------------------------------
//		Random ran = new Random(); 
//		int a = ran.nextInt(x);  x�ȬO�̤j��  ���p�O55 �N�O0~55���H���� �A�n1~55���ܦۤv+1
//		�t�~�@��random�ƪ���k���O�nimport random�b�̤W��
		int big = 100;
		int small = 0;
		int playTime = 0;
		System.out.println("�вq�Ʀr�@8��,0~100");
		
			while(playTime<8) {
				Scanner scan = new Scanner(System.in);
				int guess =scan.nextInt();
				if(guess>randomNum && big>=guess) {
					big = guess;
					System.out.println("�q���F�d��O"+small+"~"+big);
				}else if(guess<randomNum && small<=guess) {
					small =guess;
					System.out.println("�q���F�d��O"+small+"~"+big);
				}else if(guess>big || guess<small) {
					System.out.println("�A��X�W�d��F�d��O"+small+"~"+big);
				}else if(guess==randomNum) {
					System.out.println("���ߧA�q��F�A�q�F"+(playTime+1)+"��");
					break;
				}
				playTime++;
				System.out.println("�A�w�g�q�F"+playTime+"��");
			}
	}
	
// chicken and rabbit   
	@Test
	public void ifTest11() {		
		int rabbit;
//		���]��0��
		int chicken = 0;  
		while(true) {
			rabbit = 35-chicken;
			if(chicken*2+rabbit*4==100) {
				System.out.printf("�`�@��%2d����,%2d���ߤl",chicken,rabbit);
				break;
			}
			chicken+=1;
		}

	}	

//�}�C���γ]�w�ƭ�
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

// 11/2�^�a�ۤv�m�߲q�Ʀr��²��
		@Test
		public void ifTest13() {		
			int big = 99;
			int small = 1;
			int randomNum = (int)(Math.random()*(99-1+1))+1;
			Scanner scan = new Scanner(System.in);
			for(;;) {
				System.out.printf("�п�J�q�����Ʀr�d��%d~%d \n",small,big);
				int guess = scan.nextInt();	
				if(guess<small||guess>big) {
//					System.out.println("�W�X�d��F��");
					continue;
				}else if(guess==randomNum){
					System.out.println("�q���");
					break;
				}else if(guess>randomNum) {
					big = guess;
				}else if(guess<randomNum) {
					small = guess;
				}
			}

		}
		
		// ����
		@Test
		public void ifTest14() {		
			double random = Math.random()*(99-20+1)+20;
			System.out.println(random);
		}
		
		//   11/3�W�����}�C
		@Test
		public void ifTest15() {		
			String[] b = new String[10];
//			�}�C�ŧi�����שT�w �Ҧp�ڭn���L10 �N�n�o�˼g String[] b = new String[10];
			
		}



}
