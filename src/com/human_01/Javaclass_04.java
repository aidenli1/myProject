package com.human_01; //3.11금 조건문 if


//import java.nio.charset.CoderResult;

public class Javaclass_04 {

	public static void main(String[] args) {
		
			//Q1
//		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print("입력>>");
//		String x = sc.nextLine();
//		int i = Integer.parseInt(x);
//		
//		int a = 20;
//		int b = 0;
//		int x
//		
//		if (i>10) {
//			System.out.println(4);
//		}else {
//			System.out.println(2);
//		}
		
			//Q1
//		int a = 20;
//		int b = 0;
//		int sum1 = (a=b);
//		int sum2 = (b=a);
//		
//		if (a>10) {
//			System.out.println(sum1);
//		}else {
//			System.out.println(sum2);
//		}
		
			//Q2
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print("입력>>");
//		String s = sc.nextLine();
//		int i = Integer.parseInt(s);
//		
//		if (i>10) {
//			System.out.println("10보다 크다.");
//		}else {
//			System.out.println("10보다 작다.");
//			
//		}
		
		
			//Q3
		
//		int result;
//		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print("입력>>");
//		String s = sc.nextLine();
//		int i = Integer.parseInt(s);
//		
//	
//		
//		if (i == 0) {
//			System.out.println(0);
//		}else {
//			System.out.println(1);
//		}
		
			//Q5
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print("입력>>");
//		String s = sc.nextLine();
//		int i = Integer.parseInt(s);
//		
//		if (i>0) {
//			System.out.println(i);
//		}else {
//			System.out.println(i-i);
//		}
		
		//Q6
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("첫 수 입력>>");
//		int i = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("두번째 수 입력>>");
//		int g = Integer.parseInt(sc.nextLine());
//		
//		
//		if(i>g) {
//			System.out.println(i-g);
//		}else {
//			System.out.println(g-i);
//		}
		
			//Q7
		
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("첫 수 입력>>");
//		String s = sc.nextLine();
//		int i = Integer.parseInt(s);
//		
//		java.util.Scanner sc1 = new java.util.Scanner(System.in);
//		System.out.println("두번째 수 입력>>");
//		String x = sc.nextLine();
//		int g = Integer.parseInt(x);
//		
//		java.util.Scanner sc2 = new java.util.Scanner(System.in);
//		System.out.println("세번째 수 입력>>");
//		String z = sc.nextLine();
//		int r = Integer.parseInt(z);
//		
//		
//		if (i>g) {
//			System.out.println(i);
//		}else if (i>r){
//			System.out.println(i);
//		}else if (g>i) {
//			System.out.println(g);
//		}else if (g>r) {
//			System.out.println(g);
//		}
//		
//		if (r>i) {
//			System.out.println(r);
//		}else if (r>g) {
//			System.out.println(r);
//		}else {
//			System.out.println("x");
//		}
		
			//Q7
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("first : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println("2nd : ");
//		int b = Integer.parseInt(sc.nextLine());
//		System.out.println("3d : ");
//		int c = Integer.parseInt(sc.nextLine());
//		
//		if (a>b) {
//			if(a>c) {
//				System.out.println(a);
//			}else if(b>c) {
//				System.out.println(b);
//			}else {
//				System.out.println(c);
//			}
//		}else if (b>c) {
//			System.out.println(b);
//		}else {
//			System.out.println(c);
//		}

//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		int i = Integer.parseInt(sc.nextLine());
//		
//		int a = 11,  b = 14;
//		
//		if(i==0) {
//			a=5;
//		}else {
//			b=a+3;
//		}
//		System.out.println(a);
//		System.out.println(b);
		
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("kor >>");
//		int kor = Integer.parseInt(sc.nextLine());
//		System.out.println("eng >>");
//		int eng = Integer.parseInt(sc.nextLine());
//		System.out.println("math >>");
//		int math = Integer.parseInt(sc.nextLine());
//		
//		int avg = (kor+eng+math)/3;
//		
//		if (avg>=80) {
//			System.out.println("합격");
//			
//		}else {
//			System.out.println("불합격");
//		}
		
	
		
//		boolean b1 = 5!=3;
//		boolean b2 = 5==3;
//		
//		if(b1) {
//			if(b2) {
//				System.out.println("1");
//			}else {
//				System.out.println("2");
//			}
//		}else {
//			System.out.println("3");
//			System.out.println("4");
//		}
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = Integer.parseInt(sc.nextLine());
		int num3 = Integer.parseInt(sc.nextLine());
		
		if(num1>num2) { //num1이 큼
			if(num1>num3) { //num1이 가장큼
				System.out.println(num1);
			}else {
				System.out.println(num3);
			}
		}else {//num2가 큼
			if(num2>num3) {//num2가 가장큼
				System.out.println(num2);
			}else {
				System.out.println(num3);
			}
		}
		
		

		
	}

}
