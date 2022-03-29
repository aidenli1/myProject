package com.human_3_29;

import java.util.Arrays;

public class JavaBank_1 {
	//7의 배수인지 구하는 식
	public static boolean besu(int num) {
		
		boolean returnValue = false;
		
		if(num%7==0){
			return returnValue= true;
		}else {
			return returnValue= false;
		}
		
		
	}

	//문자열을 숫자만큼 출력하는 식
	public static void repeatString(String str, int count) {
		for(int i=0;i<count;i++) {
			System.out.println(str);
		}
		
		return; //생략가능
	}
	//문제 1
	
	public static void triangle1() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<6-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	public static void triangle2() {
		for(int i=3;i<5;i++) {
			for(int j=0;j<6-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	public static void triangle3() {
		for(int i=5;i<7;i++) {
			for(int j=0;j<6-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	//문제 2
	public static void name(String str) {
		
		System.out.println("이름 : "+str);
	}
	public static void age(int age) {
		System.out.println("나이 : "+ age);
	}
	public static void phoneNumber(String phoneNumber) {
		System.out.println("전화번호 : "+ phoneNumber);
	}
	//문제 4
	public static void oneMoon() {

			int[]oneMonth1=new int [32];
			String week[] = {"월","화","수","목","금","토","일"};
			
		//	int [] oneMonth1= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
			for(int i=0;i<oneMonth1.length;i++) {
				oneMonth1[i]=i;
			}
			
			
			
			for(int i=0;i<oneMonth1.length;i++) {
				System.out.println(oneMonth1[i]+"일 :"+ week[oneMonth1[i]%7]);
			}
		}
	
	//문제 5
	public static void int1() {
		System.out.print("int");
		Func();
	}
	public static void double1() {
		System.out.print("double");
		Func();
	}
	public static void cat1() {
		System.out.print("cat");
		Func();
	}public static void yeah() {
		System.out.print("int");
		yeah4();
		Func();
	}public static void yeah1() {
		System.out.print("double");
		Func();
		
	}public static void yeah2() {
		System.out.print("str");
		Func();
		
	}public static void yeah3() {
		System.out.print("cat");
		
		yeah5();
		
	}public static void yeah4() {
		System.out.print("Arr");
		
	
	}public static void yeah5() {
		System.out.print("object");
		
		Func();
		
	}public static void Func() {
		System.out.println("Func");
	}
	//문제 6
	
	public static void square() {
		int sum =0;
		System.out.println("사각형 넓이 구하기\n");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("밑변값cm>>>>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("높이값cm>>>>");
		int b = Integer.parseInt(sc.nextLine());
		sum= a*b;
		System.out.println(sum+"cm");
	}public static void triangle() {
		int sum =0;
		System.out.println("삼각형 넓이 구하기\n");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("밑변값cm>>>>");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("높이값cm>>>>");
		int b = Integer.parseInt(sc.nextLine());
		sum= (a*b)/2;
		System.out.println(sum+"cm");
	}public static void circle() {
		double sum=0;
		double pi =3.14159;
		System.out.println("원 넓이 구하기\n");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("반지름 값cm>>>>");
		int a = Integer.parseInt(sc.nextLine());
		sum= (a*a)*pi;
		System.out.println(sum);
	}
	//문제 7
	
	public static void gugu() {
		//gugu(int aa)이렇게 하고 밑에서 gugu(2) 이런식으로 받아서 계산 가능
		int sum=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println(">>>>");
		int aa = Integer.parseInt(sc.nextLine());
		
		for(int i=1;i<10;i++) {
			sum= aa*i;
			System.out.println(aa+"*"+i+"="+sum);
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		//7의배수
		
//		System.out.println(besu(100));
//		
//		if(besu(49)) {
//			System.out.println("7의 배수");
//		}else {
//			System.out.println("xxxxx");
//		}
		
		//문자열을 숫자만큼 출력
		
//		repeatString("안녕",5);
//		repeatString("hey",2);
		
		//문제 1
		System.out.println("----문제 1-------\n");
		triangle1();
		triangle2();
		triangle3();
		System.out.println("----문제 1-------\n");
		
		//문제 2
		System.out.println("----문제 2-------\n");
		
		name("홍진규");
		age(24);
		phoneNumber("010-8553-0140");
		
		System.out.println("----문제 2-------\n");
		
		System.out.println("----문제 4-------\n");
		oneMoon();
		System.out.println("----문제 4-------\n");
		
		System.out.println("----문제 5-------\n");
		int1();
		double1();
		yeah2();
		cat1();
		yeah();
		yeah3();
		System.out.println("----문제 5-------\n");
		
		
		System.out.println("----문제 6-------\n");
		
		System.out.println("----문제 6-------\n");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("1. 사각형  2. 삼각형  3. 원");
		System.out.println("선택>>>>>");
		int s = Integer.parseInt(sc.nextLine());
		
		if(s==1) {
			square();
		}else if(s==2) {
			triangle();
		}else if(s==3){
		 circle();
		}
		System.out.println("----문제 6-------\n");
		
		System.out.println("----문제 7-------\n");
		gugu();
		//gugu(int aa)이렇게 하고 밑에서 gugu(2) 이런식으로 받아서 계산 가능
		System.out.println("----문제 7-------\n");
		
		
//		String week1[] = {"월","화","수","목","금","토","일"};
//		
//		
//		for(int i=1;i<32;i++) {
//			
//			System.out.println((i+"일")+Arrays.toString(week1));
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
