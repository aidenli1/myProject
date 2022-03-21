package com.human_3_18;//배열

import java.util.Arrays;

public class Javaclass_03 {

	public static void main(String[] args) {
		

//		int arr[]=new int[4];
//		int []arr2= {1,2,3,};
//		arr2[0]=1;
		
//		int arr[]=new int[10];
//		int sum =0;
//		
//		for(int count=1;count<11;count++) {
//			if(count%6!=0) {
//			sum=count;
//			}
//			System.out.println(sum);
//		}
		
//		int arr[]=new int[10];
//		
//		for(int i =0;i<10;i++) {
//			arr[i]=6*i;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
//		for(int i = 0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
		//Q야구점수
		
//		int team1[]= {0,0,0,0,1,3,2,3,1};
//		int team2[]= {0,2,2,0,4,1,0,0,0};
//		
//		int i =0;
//		int sum=0;
//		for(i=0;i<team1.length;i++){
//			sum = team1[i]+sum;	
//		}	
//		int j =0;
//		int sum1=0;
//		
//		for(j=0;j<team2.length;j++){
//			
//			sum1 = team2[j]+sum1;
//			
//		}
//		
//		System.out.println("turn  :   1  2  3  4  5  6  7  8  9  R");
//		System.out.print("템파베이 : ");
//		System.out.println(Arrays.toString(team1)+sum);
//		System.out.print("토론토  : ");
//		System.out.println(Arrays.toString(team2)+sum1);
		
		
		
			//Q1
		
//		int a []=new int[3];
//		
//		for(int i =0;i<4;i++) {
//			a[i]=i+3;
//			System.out.println(a[i]);
//		}
		
			//Q2
//		import java.util.Arrays;
//		int a[]=new int [10];
//		
//		for(int i =0;i<10;i++) {
//			a[i]=3*i;
//		}
//		System.out.println(Arrays.toString(a));
		
			//Q3
		//import java.util.Arrays;
		
//		int a []=new int[101];
//		
//		for(int i = 1;i<101;i++) {
//			a[i]=i;
//		}
//		System.out.println(Arrays.toString(a));
		
		
			//Q4
		//import java.util.Arrays;
		
//		int a[]= {12,1,5,3,6,8,5,3};
//		int sum=0;
//		
//		for(int i =0;i<8;i++) {
//			a[i]=a[i]+a[i];
//			//sum=a[i];
//		}
//		System.out.println(Arrays.toString(a));
//		//System.out.println(sum);
		
			//Q4
		
//		int a[]= {12,1,5,3,6,8,5,3};
//		int sum=0;
//		
//		for(int i =0;i<a.length;i++) {
//			sum+=a[i];
//
//		}
//
//		System.out.println(sum);
		
			//Q4
//		int a[]= {12,1,5,3,6,8,5,3};
//		int i =0;
//		int sum=0;
//		
//		for(i=0;i<a.length;i++){
//			sum = a[i]+sum;
//		}
//		System.out.println(sum);
		
			//Q5
		
//		int a[]= {12,1,5,3,6,8,5,3};
//		int i =0;
//		int sum=0;
//		
//		for(i=0;i<a.length;i++){
//			if(a[i]%2==0){
//			sum = a[i]+sum;
//			}
//		}
//		System.out.println(sum);
		
			//Q6
		
//		int a[]= {12,1,51,3,6,8,5};
//		int max = 0;
//		int uax = 0;
//		int i = 0;
//		for(i=0;i<a.length;i++) {
//			if(a[i]>12) {
//				max=a[i];
//			}else if(a[i]<3) {
//				uax=a[i];
//			}
//		}
//		System.out.println("가장 큰 수는 ="+max+" 가장 작은 수는 = "+uax);
		
		
			//쌤풀이
		
//		int a[]= {12,1,51,3,6,8,5};
//		int max=0;
//		
//		for(int i =0;i<a.length;i++) {
//			if(max<a[i]) {
//				max=a[i];
//			}
//		}
//		System.out.println(max);
		
			//Q7
		
//		int a[]=new int[5];
//		int i,input;
//		int check=0;
//		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		
//		for(i=0;i<a.length;i++) {
//			System.out.println();
//		}
		
		
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println(">>>>");
//		int x = Integer.parseInt(sc.nextLine());
//		
//		int a[] = {1,2,3,4,5};
//		for(int i =0;i<a.length;i++) {
//			switch(x) {
//			case 1 :
//				System.out.println("1번째에 있다");
//				break;
//			case 2 :
//				System.out.println("2번째에 있다");
//				break;
//			case 3 :
//				System.out.println("3번째에 있다");
//				break;
//			case 4 :
//				System.out.println("4번째에 있다");
//				break;
//			case 5 :
//				System.out.println("5번째에 있다");
//				break;
//				default :
//					System.out.println("잘못된 값");
//					break;
//			}
//		}
		
		
		
			//Q1.배열에 5개의 숫자를 입력받아 넣은 다음 숫자 하나를 입력받아 해당 숫자가 몇번째 인덱스에 들어 있는지 
			//출력하는 프로그램을 만들어 보자.
		
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println(">>>>");
//		int x = Integer.parseInt(sc.nextLine());
//		
//		int a[] = {1,2,3,4,5};
//		for(int i =0;i<a.length;i++) {
//			if(a[i]==x) {
//				System.out.println(a[i]+"번째에 있다.");
//			}else {
//				System.out.println("x");
//			}
//		}
		
		//Q2배열에 5개의 문자를 입력받아 넣은 다음 문자 하나를 입력받아 해당 문자가 몇번째 인덱스에 들어 있는지 
		//출력하는 프로그램을 만들어 보자.
		
//		java.util.Scanner sc=new java.util.Scanner(System.in);
//		System.out.println(">>>>");
//		String x = (sc.nextLine());
//		
//		String a[] = {"A","B","C","D","E"};
//		
//		for(int i =0;i<a.length;i++) {
//			if(a[i].equals(x)) {
//			i=i+1;
//				System.out.println(i+"번째에 있다.");
//				
//				
//			}
//		}
		
		//Q3
		
		
//		java.util.Scanner scanner = new java.util.Scanner(System.in);
//
//		System.out.println("배열의 크기를 얼마로 할것인가");
//
//		int num=Integer.parseInt(scanner.nextLine());
//
//		int arr[]=new int[num];
//
//		int count=0;
//
//		for(int i=0; i<arr.length; i++) {
//
//		if(i%3==0) {
//
//		arr[i]=1;
//
//		}
//
//		}
//
//		for(int i=1; i<arr.length; i++) {
//
//		if((i-1)%3==0) {
//
//		arr[i]=2;
//
//		}
//
//		}
//
//		for(int i=2; i<arr.length; i++) {
//
//		if((i-2)%3==0) {
//
//		arr[i]=3;
//
//		}
//
//		}
//
//		System.out.println(Arrays.toString(arr));
		
		
			//Q4
		
//		int s[]= {1,2,3,4,5};
//		
//		System.out.println(Arrays.toString(s));
//		
//		for(int i=0;i<1;i++) {
//			if(s[i]!=i) {
//				 s[0]=s[4];
//				 s[1]=s[3];
//				 s[2]=s[2];
//				 s[3]=s[1];
//				 s[4]=s[0];
//				 System.out.println(Arrays.toString(s));
//			}
//		}
		
		
			//Q05
		
//		int arr[] = {1,2,3,4,5,6};
//		
//		int count1=0;
//		int count2=0;
//		int count3=0;
//		int count4=0;
//		int count5=0;
//		int count6=0;
//		
//		int a =0;
//		
//		for(int i=0;i<100;i++) {
//			a = ((int)(Math.random()*6+1));
//			if(a==1) {
//				count1++;
//				
//			}
//			if(a==2) {
//				count2++;
//				
//			}else if(a==3) {
//				count3++;
//				
//			}else if(a==4) {
//				count4++;
//				
//			}else if(a==5) {
//				count5++;
//				
//			}else if(a==6) {
//				count6++;
//				
//			}
//						
//		}
//		System.out.println(String.format("1  나온 횟수 : %d\n2  나온 횟수 : %d\n3  나온 횟수 : %d\n4  나온 횟수 : %d\n5  나온 횟수 : %d\n6  나온 횟수 : %d ",
//				count1,count2,count3,count4,count5,count6));
		
		
		

		//Q2
		
//	int []arr=new int[5];
//		
//	for(int i =1;i<arr.length;i++) {
//			
//		System.out.println(i+"번째 입력>>");
//		arr[i]=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//			
//	}
//	
//	System.out.println("찾을 숫자 입력>>");
//	int findNum = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		
//	boolean isFlag=true;
//	
//	for(int i =0;i<arr.length;i++) {
//		if(arr[i]==findNum) {
//			System.out.println(i+"번째값 :"+arr[i]);
//			isFlag=false;
//		}
//	}
//		if(isFlag) {
//			System.out.println("못찾았다리~~~~~~~~~~~~~");
//		}
		
			//Q3
		
//		int arrSize=Integer.parseInt(
//				new java.util.Scanner(System.in).nextLine());
//		
//		int arr[]=new int[arrSize];
//		
//		for(int i =0;i<arr.length;i++) {
//			arr[i]=i%3+1;
//		}
//		for(int i =0;i<arr.length;i++) {
//			System.out.println(Arrays.toString(arr));
//		}
		
		//Q4
		
//		int arr[]= {1,2,3,};
//		
//		int arr1[]=new int [arr.length*2];
//		int arr2[]=new int [arr.length*2];
//		
//		for(int i =0;i<3;i++) {
//			arr1[i]=arr[i];
//		}
//		for(int i=0;i<3;i++) {
//			arr1[arr.length+i]=arr[arr.length-i-1];
//		}
//		for(int i=0;i<arr1.length;i++) {
//			System.out.println(arr1[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
