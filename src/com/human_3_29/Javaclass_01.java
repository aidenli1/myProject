package com.human_3_29;

public class Javaclass_01 {
	
	public static int sum(int a,int b) {
		int sum = 0;
		sum=a+b;
		return sum;
		
	}
	public static int div(int a,int b) {
		
		return a/b;
		
	}
	public static int min(int a,int b) {
		
		return a-b;
		
	}
	public static int mul(int a,int b) {
		
		return a*b;
		
	}

	public static void main(String[] args) {
		
		int a = sum(1,2); //3
		int b= a+sum(2,2); //7
		System.out.println(a+b); //10
		System.out.println(mul(a,b)); 
		
		
		
		
		
		
		
		

	}

}
