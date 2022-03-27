package com.human_3_26;

import java.util.Arrays;

public class Javaclass_01_3_26 {

	public static void main(String[] args) {
		//상수와 변수
		
	
		
//		String name ="홍길동";
//		int age = 29;
//		int height=170;
//		System.out.println("name : "+name+" age : "+age+" hiehgt : "+height);
		
//		int a=5;
//		int b=10;
//		System.out.println((a+3)+b);
		
		//연산자와 우선순위
		
//		int a =6;
//		a=a+3;
//		System.out.println(a);
		
//		int a=5 , b=6;
//		int sum = a + b;
//		a=7;
//		System.out.println(sum+","+a+","+b);
//		sum = a+b;
//		System.out.println(sum+","+a+","+b);
		
//		double sum1=8%5, sum2= sum1*1;
//		double sum3=5*5, sum4=sum3+3;
//		double sum5= sum2 + sum4;
//		System.out.println(sum5);
		
		//형변환과 연산
		
		
//		int a= Integer.parseInt("11");
//		System.out.println(a);
//		
//		System.out.println(3+3+"hello");
//		//System.out.println(3*"hello");
//		System.out.println("hello"+4+4);
//		
//		String name ="홍길동";
//		int age =14;
//		System.out.println("name is :"+name+" age is : "+age);
		
		
		// Scannet paresInt String.Format
		
		java.util.Scanner sc =new java.util.Scanner(System.in); 
//		System.out.println(">>>>");
//		int a =Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		String b = sc.nextLine();
//		
//		System.out.println(a);
//		System.out.println(b);
		
//		System.out.println("가로>>>>>");
//		System.out.println("세로>>>>>");
//		int a =Integer.parseInt(sc.nextLine());
//		
//		
//		int b = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(a*b);
		
//		System.out.println(">>>>");
//		double a =Double.parseDouble(sc.nextLine());
//		
//		System.out.println("키는 : "+a*100+" cm입니다.");
		
		
//		int penPrice = 1000;
//		int penBox = penPrice*12;
//		
//		System.out.println("연필구매 개수 입력");
//		int a = Integer.parseInt(sc.nextLine());
//		int sum1 = penPrice*a;
//		
//		System.out.println("박스로 구매할 개수 입력");
//		int b = Integer.parseInt(sc.nextLine());
//		int sum2 = penBox*b;
//		
//		System.out.println(sum1+sum2+"원입니다.");
		
		//String.format
		
		
//		String str1= "홍길동";
//		String str2= String.format("이름은 : %s",str1);
//		String str3= "이름은 : "+str1;
//		System.out.println(String.format("이름은 : %s",str1));
//		System.out.println(str2);
//		System.out.println(str3);
		
		//배열
		//자료형 변수명[] = new 자료형[데이터생성갯수];
		//다양한 선언방법
		
//		int arr1[] = new int [5];
//		int []arr2= new int[5];
//		int []arr3;
//		arr3=new int[5];
//		int arr4[]= {0,0,0,0,0};
//		double arr5[]= {1.1,2.2,3.3,4.4};
//		String arr6[]= {"dog","cat","fish"};
		
//		int a[]= {1,2,3,4,5,6,7};
//		a[2]=12;
//		System.out.println(a[1]);
		
//		int a[]= {1,2,3,4,5};
//		int b =1;
//		int sum= a[0]+a[1]+a[2]+a[3]+a[4];
//		sum=sum/5;
//		System.out.println(a[0]);
//		System.out.println(sum);
		
		
//		int a[]= {1,2,3,4,5};
//		String s[]= {"hey","hi","what"};
//		
//		System.out.println(Arrays.toString(s));
		
		
		//if문
		
//		int a=20;
//		int b=0;
//		
//		if(a>40) {
//			a=b;
//		}else {
//			b=a;
//		}
//		System.out.println(b);
		
//		System.out.println(">>>>>");
//		int a =Integer.parseInt(sc.nextLine());
//		
//		if(a%5==0) {
//			System.out.println("a는 5의 배수");
//		}else {
//			System.out.println("xxxxx");
//		}
		
//		System.out.println(">>>>>");
//		int n = Integer.parseInt(sc.nextLine());
//		
//		int si= n/3600;
//		int bun=(n%3600)/60;
//		int cho = (n%3600)%60%60;
//		
//		System.out.println(n+"초는 "+si+"시간 "+bun+"분 "+cho+"초 입니다.");	
//		System.out.println(si);
//		System.out.println(bun);
//		System.out.println(cho);
		
		
//		int a =10;
//		int b= 20;
//		int sum=0;
//		
//		sum=a;
//		a=b;
//		b=sum;
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(sum);
		
		int a=0;
		int b=0;
		int c=0;
		
		
		System.out.println("1st>>>>");
		int x= Integer.parseInt(sc.nextLine());
		System.out.println("2nd>>>>");
		int z= Integer.parseInt(sc.nextLine());
		System.out.println("3rd>>>>");
		int y= Integer.parseInt(sc.nextLine());
		
		if(x<y) {
			if(x<z) {
				a=x;
			}else if(y<z) {
				a=y;
			}else if(y<x) {
				a=y;
			}else {
				a=z;
			}
		}
		if(x<y) {
			if(x>z) {
				a=z;
				b=x;
				c=y;
			}else if(x>y) {
				if(x<z) {
					a=y;
					b=x;
					c=z;
				}
			}else if(y>z) {
				if(z>x) {
					a=x;
					b=z;
					c=y;
				}
			}
		}
		
		
		
		
		
		System.out.println(a+","+b+","+c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
