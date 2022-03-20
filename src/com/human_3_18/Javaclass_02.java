package com.human_3_18;

public class Javaclass_02 {

	public static void main(String[] args) {
		
		//두수의 최소 공배수
		
//		int a = 2; //0,2,4,6,8,10,12
//		int b = 3; //0,3,6,9,12
//		//최소공배수 = 6
//		
//		int i =1;
//		boolean isFlag=true;//while에 넣기위해 선언
//		int result=0;
//		
//		while(isFlag) {
//			if(i%a==0 && i%b==0) {
//				result=i;
//				isFlag=false; //false되면 if문 탈출
//			}
//			i++;
//		}
//		System.out.println(result);
		
//		int a = 10;
//		int b = 23;
//		
//		int i=1;
//		int result=0;
//		boolean isFlag=true;
//		
//		while(isFlag) {
//			if(i%a==0 && i%b==0) {
//				result=i;
//				isFlag=false;
//			}
//			i++;
//		}
//		System.out.println(result);
		
		//15를  3으로 나눈 나머지가0이면 15는 3의 배수이다.
		//i를 3으로 나눈 나머지가 0이면 i는 3의 배수이다.
		
			//while문 쉽게...?
		
//		int a = 5;
//		int b = 2;
//		int i = 1;
//		
//		while(!(i%a==0 && i%b==0)) {
//			i++;
//		}
//		System.out.println(i);
		
			//for문
		
//		int a =5;
//		int b = 2;
//		int sum1=0;
//		boolean isFlag=true;
//		
//		for(int i=1;isFlag;i++) {
//			if(i%a==0 && i%b==0) {
//				sum1=sum1+i;
//				isFlag=false;
//			}
//		}
//		System.out.println(sum1);
		
			//for문 다른방법
		
//		int a = 5;
//		int b = 2;
//		int i=1;
//		
//		for(i=1;!(i%a==0&&i%b==0);i++) {
//			
//		}
//		System.out.println(i);
		
		//다른방법_02
		
//		int a = 5;
//		int b = 2;
//		int i=1;
//		
//		for(i=1;i<=a*b;i++) {
//			if(i%a==0&&i%b==0) {
//				break;
//			}
//			
//		}
//		System.out.println(i);
		
		
			//do while문
		
//		int a=5;
//		int b=2;
//		int i =1;
//		int sum =0;
//		boolean isFlag=true;
//		do {
//			if(i%a==0 && i%b==0) {
//				sum=sum+i;
//				isFlag=false;
//			}
//			i++;
//		}while(isFlag);
//		
//		System.out.println(sum);
		
		
			//do while문 쉽게
		
//		int a=5;
//		int b=2;
//		int i =1;
//	
//		do {
//			
//			i++;
//		}while(!(i%a==0 && i%b==0));
//		
//		System.out.println(i);
		
		
//		int a [] = new int[3];
//		for(int count=0;count<3;count++) {
//			a[count]=count+1;
//		}
//		for(int count=0;count<3;count++) {
//			System.out.println(a[count]);
//		}
		
		//Q1
		
		int a [] = new int[4];
		for(int count=1;count<4;count++) {
			a[count]=count+2;
		}
		for(int count=1;count<4;count++) {
			System.out.print(a[count]+"\t");
		}
		
//		int team1 [] = new int [10];
//		int team2 [] = new int [10];
//		
//		for(int team1TotalScoure=0;team1TotalScoure<11;team1TotalScoure++) {
//			team1[team1TotalScoure]=team1TotalScoure+1;
//		}
//		for(int team2TotalScoure=0;team2TotalScoure<11;team2TotalScoure++) {
//			System.out.println(team1[team2TotalScoure]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
