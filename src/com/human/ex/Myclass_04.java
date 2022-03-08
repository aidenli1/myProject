package com.human.ex;

//class는 관련있는 데이터를 묶어서 사용하기 위해서 사용
	//변수와 메소드를 묶어서 프로그램으로 구현한것(이것저것 다 묵여진 결과물 = 객체)
	//식별가능한 모든것을 객체라 함. 객체지향 프로그램 언어
	// 클래스는 선언부와 생성부로 나눠져 있다.
	// 클래스는 참조자료형

//현실세계의 데이터를 기본자료형 변수에 넣어서 출력해보고 클래스로 업그레이드 해보자.

class Human{ //클래스 지정 //선언부
	
	public String name;
	public int age;
	public double height;
}

public class Myclass_04 {

	public static void main(String[] args) {
		
	Human h1= new Human(); //생성부
	h1.name="adien";
	h1.age=24;
	h1.height=178.4;
	
	Human h2= new Human();
	h2.name="james";
	h2.age=25;
	h2.height=180.4;
	
	Human h3= new Human();
	h3.name="noa";
	h3.age=31;
	h3.height=158.4;
	
	System.out.println("이름 :"+h2.name);
	System.out.println("나이 :"+h2.age);
	System.out.println("키 :"+h2. height);
	
	
	
	
	
//		
//	String name1= "aiden";
//	int age = 24;
//	double height =178.4;
//	
//	String name2= "james";
//	int age2 = 35;
//	double height2 =148.4;
//	
//	String name3= "noa";
//	int age3 = 73;
//	double height3 =174.5;
	
	
		
	//class는 관련있는 데이터를 묶어서 사용하기 위해서 사용

	}

}
