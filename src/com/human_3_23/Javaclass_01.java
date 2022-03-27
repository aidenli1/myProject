package com.human_3_23;

import java.util.Scanner;

public class Javaclass_01 {

	public static void main(String[] args) {

//		//Q1
//		
//		System.out.println("Q1");
//		for(int i=1;i<51;i++) {
//			if(i%2==0) {
//				System.out.println("짝수는 : "+i);
//			}
//		}
//
//		//Q2
//		
//		System.out.println("Q2");
//		for(int i = 1;i<101;i++) {
//			if(i%10==0) {
//				System.out.println("10의 배수는 : "+i);
//			}
//		}
//		
////		//Q3
//		
//		System.out.println("Q3");
//		int sum1=0;
//		for(int i =30;i<301;i++) {
//			if(i%6==0) {
//				sum1=sum1+i;
//			}
//		}
//		System.out.println("총합은 : "+sum1);
//		
//		//Q4
//		
//		System.out.println("Q4");
//		System.out.println(">>>>");
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println("둘째 값>>>>");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		for(int i=0;i<a;i++) {
//			System.out.println(i+1);
//		}
//		for(int j=0;j<b;j++) {
//			System.out.println(j+1);
//		}
		

//		//Q5
//	
//		int c,d,f;
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("첫번째 수 입력 : ");
//		c=Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 수 입력 : ");
//		d=Integer.parseInt(sc.nextLine());
//		if(c>d) {
//			f=c;
//			c=d;
//			d=f;
//		}
//		if(c==d) {
//			System.out.println("수가 같다");
//		}
//		for(c=c+1;c<d;c++) {
//			System.out.print(c+" ");
//		}
//		System.out.println();
//		System.out.println();
//		
//		//Q6
//		
//		int c,d,f;
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("첫번째 수 입력 : ");
//		c=Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 수 입력 : ");
//		d=Integer.parseInt(sc.nextLine());
//		if(c>d) {
//			f=c;
//			c=d;
//			d=f;
//		}
//		if(c==d) {
//			System.out.println("수가 같다");
//		}
//		for(c=c+1;c<d;c++) {
//			if(c%2==0) {
//			System.out.print(c+" ");
//			}
//		}
//		System.out.println();
//		System.out.println();
//		
//		
//		
//		//Q7
//		
//		int sum1=0;
//		
//		for(int i=1;i<101;i++) {
//			if(i%2==0) {
//				sum1=sum1-i;
//			}else {
//				sum1=sum1+i;
//			}
//		}
//		
//		System.out.println(sum1);		
//		
//			//Q8
//		//이거 안돌아감
//		double sum1=0;
//		
//		for(double i=1;i<100;i++) {
//			if(i%2==0) {
//				sum1=sum1/(i+1);
//			}else {
//				sum1=sum1/(i+1)+1;
//			}
//		}
//		System.out.println(sum1);
//		// 풀이
		
		
//		double sum1=0;
//		for(int i=1;i<100;i++) {
//			sum1 +=((double)i/(i+1));
//		}
//		System.out.println(sum1);
		
		
			//Q9
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				
			}
			System.out.println(i);
		}
		
		
		
		
		//Q10
		
//			String a="1111111";
//			int x=0;
//			int z=0;
//			int bb=0;
//
//			while(!a.equals("0")) {
//			
//			System.out.println("MENU :  1. 1-Color   2. 2-Brightness");
//			System.out.println("종료를 원하시면 0 을 눌러주세요");
//			System.out.println("종류를 선택하시오 >>>>>");
//			java.util.Scanner sc = new java.util.Scanner(System.in);
//			a = new Scanner(System.in).nextLine();
//		
//			if(a.equals("1")) {
//				System.out.println("Color : 1.1 Red  2.2 Yellow  3.3 Blue");
//				System.out.println("종류를 선택하시오 >>>>>");
//				a = new Scanner(System.in).nextLine();
//				if(a.equals("1")) {
//					System.out.println("빨강으로 변경합니다");
//				}else if(a.equals("2")) {
//					System.out.println("노랑으로 변경합니다");
//				}else if(a.equals("3")) {
//					System.out.println("파랑으로 변경합니다");
//				}else {
//					System.out.println("잘못입력");
//				}
//				System.out.println("1.-돌아가기 0-종료");
//				a = new Scanner(System.in).nextLine();
//				if(a.equals("1")) {
//					continue;
//				}else if(a.equals("0")) {
//					System.out.println("종료합니다");
//				}
//			}else if(a.equals("2")) {
//				System.out.println("Brightness : 1. 1 +  2. 2  - 3. 3 -직접입력-");
//				System.out.println("종류를 선택하시오 >>>>>");
//				a = new Scanner(System.in).nextLine();
//				if(a.equals("1")) {
//					x++;
//					System.out.println("현재 밝기"+x);
//				}else if(a.equals("2")) {
//					x--;
//					System.out.println("현재 밝기"+x);
//				}else if(a.equals("3")) {
//					java.util.Scanner scc=new java.util.Scanner(System.in);
//					System.out.println("밝기 입력 1~100 : ");
//					bb=Integer.parseInt(sc.nextLine());
//					if(bb<101) {
//						x=x+bb;
//						System.out.println("현재 밝기 : "+x);
//					}else {
//						System.out.println("잘못입력");
//					}
//				}else {
//					System.out.println("잘못입력");
//				}System.out.println("1.-돌아가기 0-종료");
//				a = new Scanner(System.in).nextLine();
//				if(a.equals("1")) {
//					continue;
//				}else if(a.equals("0")) {
//					System.out.println("종료합니다");
//				}
//			}else if(a.equals("0")) {
//				System.out.println("종료합니다");
//			}
//			
//			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
