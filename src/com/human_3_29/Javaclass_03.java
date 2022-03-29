package com.human_3_29; //재귀 호출

public class Javaclass_03 {
	
	public static void function1() {
		System.out.println("함수 1----");
		function5();
		function6();
	}public static void function2() {
		System.out.println("함수 2----");
		
		
	}public static void function3() {
		System.out.println("함수 3----");
		
	}public static void function4() {
		System.out.println("함수 4----");
		
	}public static void function5(){
		System.out.println("함수 5 ㅅㅈ-----");
		function3();
	}public static void function6() {
		System.out.println("함수 6 ------;;");
	
	}

	public static void main(String[] args) {
		
		function1();
		function3();
		function4();
		
	}

}
