package com.human_3_17;

public class Javaclass_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a = 10;
//		for(int a=10;a<20;a++) {
//			System.out.println(a);
//		}

		
//		if(5>3) {
//			System.out.println("true");
//		}
		
		
//		if(4>3) {
//			System.out.println("true");
//		}else {
//			System.out.println("flase");
//		}
		
		
//		int a =2;
//		if(a==1) {
//			System.out.println("1");
//		}else if(a==2) {
//			System.out.println("2");
//		}else if (a==2) {
//			System.out.println("2");
//		}else {
//			System.out.println("3");
//		}
		
		
//		switch(a) {
//		case 1 :
//			System.out.println("1");
//			break;
//		case 2 :
//			System.out.println("2");
//			break;
//		case 3 :
//			System.out.println("3");
//			break;
//			default :
//				System.out.println("4");
//				break;
//		}
		
		// for
		
//		int sum = 0;
//		
//		for(int i = 1;i<10;i++) {
//			if(i%2==0) {
//				sum = sum + i;
//			}
//			
//		}
//		System.out.println(sum);
		
		
		
		// while
		/*
		 * 초기식
		  while(조건식){
		         증감식
		  }
		 */
		
//		int sum =0;
//		int i = 1;
//		while(i<10) {
//			if(i%2==0) {
//				sum = sum+i;
//			}
//			i++;
//			
//		}
//		System.out.println(sum);
		
		
		// do while 반드시 한 번 실행
		/*
		 * 초기식
		 * 	do{
		 * 		코드
		 * 		증감식
		 * } while(조건식);
		 */
		
//		int sum = 0;
//		int i = 1;
//		do {
//			if(i%2==0) {
//				sum=sum+i;
//			}
//			i++;
//		}while(i<10);
//		
//		System.out.println(sum);
		
		//break와 continue
		
//		for(int i =0;i<10;i++) {
//			if(i==5) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		//Q0_for
		
//		for(int i = 4;i<10;i++) {
//			System.out.println(i);
//		}

		
//		int sum = 0;
//		for(int a = 10;a<30;a++) {
//			sum=sum+a;
//		}
//		System.out.println(sum);
		
		//Q0_while
		
//		int x = 4;
//		while(x<9) {
//			x++;
//			System.out.println(x);
//		}

//		int sum1 = 0;
//		int i = 9;
//		
//		while(i<29) {
//			i++;
//			sum1=sum1+i;
//		}
//		System.out.println(sum1);
		
		
		//Q0_dowhile
		
		
		// do while 반드시 한 번 실행
				/*
				 * 초기식
				 * 	do{
				 * 		코드
				 * 		증감식
				 * } while(조건식);
				 */
		
		
//		int i = 4;
//		
//		do {
//			
//			i++;
//			System.out.println(i);
//		}while(i<9);
		
		
//		int sum2= 0;
//		int z = 9;
//		
//		do {
//			z++;
//			sum2=sum2+z;
//			
//		}while(z<29);
//		System.out.println(sum2);
		
		//Q1
		
		//while
		
//		int a = 2;
//		int b = 1;
//		b++;
//		
//		while(b<15) {
//			a=a+1;
//			b=b+a;
//		}
//		System.out.println(a);
//		System.out.println(b);
		
		//for
		
//		int a = 2;
//		
//		for(int b=1;b<15;b++) {
//			a=a+1;
//			b=b+a;
//		}
//		System.out.println(a);
//		System.out.println(a);
		
		//Q2
		
//		int sum = 0;
//		
//		for(int i =1;i<101;i++) {
//			if(i%2==0) {
//				sum=i;
//				System.out.println("1~100까지 약수는 : "+sum);
//			}
//		}
		
		//Q3 몰라
		
//		java.util.Scanner sc= new java.util.Scanner(System.in);
//		
//		System.out.println("a>>>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		
//		for(int i =1;i<10;i++) {
//			if(i%2==0) {
//				a=i;
//				System.out.println(a);
//			}
//		}
//		
//		System.out.println("b>>>>>");
//		int b = Integer.parseInt(sc.nextLine());
//
//		for(int i =1;i<10;i++) {
//			if(i%2==0) {
//				
//				System.out.println(b);
//			}
//		}
		
		//Q4
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		
//		int sum = 0;
//		int max = 0;
//		
//		if(a<=b) {
//			sum = a;
//		}else {
//			sum = b;
//		}
//		for(int i =1;i<sum;i++) {
//			if(a%i==0 && b%i==0) {
//				max=i;
//			}
//		}
//		System.out.println(max);
		
		
		//Q4 내가 푼거
		

//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int sum=0;
//		
//		for(int i =1;i<100;i++) {
//			if(a%i==0 && b%i==0) {
//				sum=i;
//			}
//		}
//		
//		System.out.println(sum);
		
		//Q5
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		int sum = 0;
//		
//		for(int i =0;a<100;a++) {
//			sum=a+a;
//			if(sum==100)
//			break;
//		}
//		System.out.println(sum);
		
		//Q6
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int c = Integer.parseInt(sc.nextLine());
//		
//		
//		if(a) {
//			
//		}
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.print("num1: ");
//		int num1 = sc.nextInt();
//		System.out.print("num2: ");
//		int num2 = sc.nextInt();
//		int max; //둘 중 큰 수 변수 선언
//		int resMin=0; //최소공배수 변수 선언
//		// 둘 중에 큰 수 찾기
//		if(num1>=num2) {
//		max = num1;
//		} else {
//		max = num2;
//		}
//		for(int i=max; i>=max; i++) { //큰 수를 시작값으로 1씩 증가하는 무한반복
//		if(i%num1==0 && i%num2==0) { //두 수를 각각 i로 나눈 나머지가 0일때까지 반복
//		resMin = i; // if의 조건식이 성립하는 조건이 곧 최소공배수
//		break; // 프로그램 종료.
//		}
//		}
//		System.out.println(num1 + "," + num2 + "의 최소공배수: " + resMin);

		
		
		
		//Q8
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int c = Integer.parseInt(sc.nextLine());
//		
//		int max;
//		int nmax;
//		
//		if(a>b) {
//			max = a;
//			if(a>c) {
//				max=a;
//			}else if(b>a) {
//				max=b;
//			}else {
//				max=c;
//			}
//		}else if(b>c) {
//			max=b;
//		}else {
//			max=c;
//			
//		}
//		if(a<b) {
//			nmax = a;
//			if(a<c) {
//				nmax=a;
//			}else if(b<a) {
//				nmax=b;
//			}else {
//				nmax=c;
//			}
//		}else if(b<c) {
//			nmax=b;
//		}else {
//			nmax=c;
//		}
//		System.out.println("가장 큰 수는 : "+max+"가장 작은 수는 : "+ nmax);
		
		
		//Q9
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int c = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int d = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int e = Integer.parseInt(sc.nextLine());
//		
//		int not = 0;
//		int sum = 0;
//		
//		while(not<4) {
//			if(a>=60) {
//				sum++;
//			}else {
//				not++;
//			}if(b>=60) {
//				sum++;
//			}else {
//				not++;
//			}if(c>=60) {
//				sum++;
//			}else {
//				not++;
//			}if(d>=60) {
//				sum++;
//			}else {
//				not++;
//			}if(e>=60) {
//				sum++;
//			}else {
//				not++;
//			}
//		}
//		System.out.println(not);
		
		//Q10
//		int j =0;
//		
//		for(int i=1;i<100;i++) {
//			j=j+i;
//			if(j>=100) {
//				break;
//			}
//			System.out.println(i+":"+j);
//			}
		
		//Q11
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println(">>>>");
//		String  a =sc.nextLine();
//		
//		System.out.println(">>>>");
//		int b = Integer.parseInt(sc.nextLine());
//
//		int x =0;
//		while(x<b) {
//			x++;
//			System.out.println(a);
//		}
		
		//Q12
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		int x =0;
//		int z =0;
//		
//		while(x==a) {
//			x++;
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int sum = 0;
//		for(int i = 20;i<52;i++) {
//			if(i%3==0) {
//				sum=i;
//			}
//		}System.out.println(sum);
		
		
//		int sum=0;
//		int i =0;
//		while(i<52) {
//			i++;
//			if(i%3==0) {
//				sum=i;
//			}
//		}
//		System.out.println(sum);
		
		
//		int sum = 0;
//		int i =20;
//		do {
//			if(i%3==0) {
//				sum=i;
//				
//			}
//			i++;
//		
//		}while(i<52);
//		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a = 120;
//		int b = 90;
//		int min =0;
//		
//		if(a>b) {
//			min=b;
//		}else {
//			min=a;
//		}
//		for(int i =1;i<min;i++) {
//			if(a%i==0 && b%i==0) {
//				System.out.println("공약수"+i);
//			}
//		}
		
//		int sum = 0;
//		while(sum>=100) {
//			int input=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		}
//		System.out.println(sum);
		
		
		
		//Q6
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(">>>>");
//		int c = Integer.parseInt(sc.nextLine());
//		
//		int rc =0;
//		int wc = 0;
//		int sum= 0;
//		
//		while(rc<3) {
//			if(a>=1&& a<=10) {
//				rc++;
//				sum = sum+a;
//			}else {
//				wc++;
//			}
//		}
//		System.out.println(rc);
//		System.out.println(wc);
//		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//약수 구하는법
		
		
		
//		for(int i =1;i<100;i++) {
//			if(100%i==0) {
//				System.out.println(i);
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
