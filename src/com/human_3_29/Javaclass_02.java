package com.human_3_29;

public class Javaclass_02 {
	
	public static int sumAll(int a, int b) {
		int sum=0;
		if(a>b) {
			int temp; temp=a;a=b;b=temp;
		}
		for(int i =a;i<=b;i++) {
			sum=sum+i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		int a=5; 
		int b=2;
		System.out.println(sumAll(a,b));
		System.out.println(sumAll(2,5));

	}

}
