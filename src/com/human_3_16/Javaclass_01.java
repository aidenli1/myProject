package com.human_3_16;

public class Javaclass_01 {

	public static void main(String[] args) {
		
//		String str = "if";
//		if(str=="if") {
//			System.out.println(1);
//		}
//		
//		int a= 2;
//		switch(a) {
//		case 1 :
//			System.out.println(1);
//			break;
//		case 2 :
//			System.out.println(2);
//			//break없으므로 값이 흘러내려 2,3이 출력
//		case 3 :
//			System.out.println(3);
//			break;
//			default :
//				System.out.println(4);
//				break;
//		}
		
			//for문
		
		
//		for(int i =0;i<10;i++) {
//			System.out.println(i);
//		}
		
		//Q1
		
//		for(int i =0;i<5;i++) {
//			System.out.println("안녕");
//		}
		
		
		
		//Q2
		
//		for(int i =0;i<4;i++) {
//			System.out.println(i+1);
//		}
//		for(int i =1;i<5;i++) {
//			System.out.println(i);
//		}

			//1~10까지의 합 구하기
//		int sum = 0;
//		for (int i =1;i<11;i++) {
//			System.out.println(sum+"+"+i+"="+(sum+i));
//			sum=sum+i;
//			
//		}
//		System.out.println("최종출력 : " +sum);
		
			//Q3
		
//		int sum =0;
//		
//		for(int i=8;i<21;i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
			//Q4
//		for(int i = 1;i<5;i++) {
//			System.out.println(i+5);
//		}
		
		//Q5 20~30사이의 짝수를 모두 더한 합
		
//		int sum1 =0;
//		
//		for(int i=20;i<30;i++) {
//			if(i%2==0) {
//				sum1=sum1+i;	
//			}
//			
//		}System.out.println(sum1);
		
		//다른 방법 하지만 권장하지않음
//		int sum3 =0;
//		
//		for(int i=20;i<30;i=i+2) {//조건식을 더 넣ㅇ르수 잇지만 권장 x
//			if(i%2==0) {
//				sum3=sum3+i;	
//			}
//			
//		}System.out.println(sum3);
		
		
		
		
		
		
		
		
		
			//Q1
		
//		int sum = 0;
//		int a = 0;
//		int b = 0;
//		
//		for(int i = 0;i<10;i++) {
//			sum=sum+i;
//			if(sum<9) {
//				System.out.println("a");
//			}else {
//				System.out.println("b");
//			}
//		}
		
		
		
		//while문
		
//		for(초기식;조건식;증감식) {
//			
//		}
//		
//		초기식
//		while(조건식) {
//			반복코드
//			증감식
//		}
		
		
//		int sum = 0;
//		for (int i =1;i<11;i++) {
//			System.out.println(sum+"+"+i+"="+(sum+i));
//			sum=sum+i;
//		}
		
//		int sum1 = 0;
//		int a = 1;
//		while(a<11) {
//			System.out.println(String.format(
//					"%d+%d=%d",sum1,a,sum1+a));
//			sum1=sum1+a;
//			a++;
//		}
//		
//		System.out.println(sum1);
		
		//Q1
		
//		int a =0;
//		while(a<4) {
//			System.out.println("안녕");
//			a++;
//		}
		//Q2
		
//		int i = 1;
//		while(i<5) {
//			System.out.println(i);
//			i++;
//		}
		
		//Q3
		
//		int sum=0;
//		int i = 1;
//		while(i<11) {
//			sum=sum+i;
//			i++;
//		}System.out.println(sum);
		
		//Q4
		
//		int i =1;
//		while(i<5) {
//			
//			System.out.println(i);
//			i++;
//		}
		
		//Q5
		
//		int sum = 0;
//		int i =8;
//		
//		while(i<20){
//			i++;
//			if(i%2!=0) {
//				
//				sum=sum+i;
//				
//			}
//		}
//		System.out.println(sum);
		
//		int sum=0;
//		for(int i =1;i<11;i++) {
//			System.out.println(i);
//			sum=sum+i;
//			
//		}System.out.println(sum);
		
//	
			//Q1
		
		
		
		
		
		
//		int sum=0;
//		int i = 1;
//		while(i<11) {
//			sum=sum+i;
//			i++;
//		}System.out.println(sum);
		
		
		//Q1
		
//		System.out.println("01");
//		System.out.println("02");
//		System.out.println("03");
		
		//Q2
		
//		int a = 2;
//		
//		switch(a) {
//		case 1 :
//			System.out.println("00");
//			break;
//		case 2 :
//			System.out.println("01");
//		
//			System.out.println("02");
//		
//			System.out.println("04");
//			break;
//			
//			default :
//				System.out.println("xx");
//		
//		}
		
//		//Q3
//		
//		int sum =0;
//		
//		for(int i = 1;i<3;i++) {
//			if(i%1==0) {
//				sum=sum+i;
//				System.out.println("0"+sum);
//			}
//		}
//		
//		//Q3_01
//		
//		for(int i = 1;i<4;i++) {
//			
//				System.out.println("0"+i);
//			
//		}
		
//		//Q3_02
//		
//		int a= 0;
//		System.out.println("01");
//		while(a<1) {
//			System.out.println("02");
//			a++;
//		}
//	
//		System.out.println("03");
//		
//		
//		
//		//Q3_03
//		
//		int a= 0;
//		System.out.println("01");
//		while(a<3) {
//			System.out.println("02");
//			a++;
//		}
//	
//		System.out.println("03");
		
		
		//문제1
		
//		int a = 0;
//		System.out.println("1");
//		
//		while(a<1) {
//			System.out.println("2");
//			a++;
//		}
//		System.out.println("3");
//		
//		int a1 = 0;
//		System.out.println("4");
//		
//		while(a1<1) {
//			System.out.println("11");
//			a1++;
//		}
//		System.out.println("5");
//		
//		switch(a) {
//		case 1 :
//			System.out.println("7");
//			
//		case 2 :
//			System.out.println("8");
//		case 3 :
//			System.out.println("9");
//			break;
//		default : 
//			System.out.println("6");
//			break;
//		}
//		System.out.println("10");
		
		//문제2
		
		
//		int a = 2;
//		int b = 1;
//		b++;
//		System.out.println(a);
//		System.out.println(b);
//		
//		while(b<15) {
//			a=a+1;
//			b=b+a;
//		}
//		System.out.println(a);
//		System.out.println(b);
		
		
		//문제3
		
//		int a = 4;
//		System.out.println("p1");
//		while(a<5) {
//			
//		if(a<5) {
//			System.out.println("p3");
//		}else  {
//			System.out.println("p2");
//		}
//			a++;
//		}
//		switch(a) {
//		case 5 :
//			System.out.println("p4");
//			System.out.println("p5");
//			break;
//		default :
//			System.out.println("p6");
//			System.out.println("p7");
//			break;
//			
//			
//		}
//		System.out.println("p8");
//		System.out.println("p9");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Q4
		
//		for(int i =1;i<4;i++) {
//			System.out.println(i);
//		}
		
		
		
		//Q5
//		for(int i =1;i<2;i++) {
//			System.out.println(i+i+i);
//		}
		
		
		//Q6
		
	
//		for(int i =3;i<11;i++) {
//			System.out.println(i);
//		}
		
		//Q7
		
//		int sum = 0;
//		for(int i =1; i<11;i++) {
//			sum = sum+i;
//			
//		}System.out.println(sum);
		
		//Q8
		
//		int sum = 0;
//		for(int i =15; i<31;i++) {
//			sum = sum+i;
//			
//		}System.out.println(sum);
		
		
		//Q9
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("숫자입력>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		
//		for(int i = 1; i<10;i++) {
//			System.out.println(i*a);	
//		}
		
	
		
		
		
		
		

	}

}
