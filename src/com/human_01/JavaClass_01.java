package com.human_01; //3.11


public class JavaClass_01 {

	public static void main(String[] args) {
		
//	//클래스 선언
//		Pack p1;//스택에 Pack클래스 주소 담을수 있는 변수 선언
//		//힙에 pack 클래스 저장공간을 힙에 생성하고 생성된 주소를 스택에 P2에 저장
//		//System.out.println(p1); Pack p1 = null;
//		
//		Pack p2 = new Pack();
//		System.out.println(p2);
//		
//		p2. name = "홍길동";
//		p2. age =19;
//		p2.height=123.5;
//		System.out.println(p2);
//		
//		Pack p3 = new Pack("홍길남",19,123.5);
//		
//		System.out.println(p3);
		
		
		
		//객체 비교
		
		Pack p1 = new Pack("홍길동",100,166.5);
		Pack p2 = new Pack("홍길동",10,166.5);
		Pack p3 = p1;
		
		System.out.println(p1==p2); // stack에 찍히는 값이 달라서 false
		System.out.println(p1==p3); // stack에 찍히는 값이 같아서 true
		System.out.println(p1.equals(p2)); 
		System.out.println(p1.equals(p3));
		
		/* 
		 * 모든 클래스는 Object를 상속받고 Object를 상속 받으면 Object가
		가지고 있는것을 사용할수 있다.
		.equals는 객체를 비교하기 위해서 사용되는 메소드이다.
		Object에 있어서 만들지 않고도 사용할수 있다.
		
		==와 .equals는 같다. 둘다 두 객체 비교.
		*/
		
		
		
		
		
		
		
		
		
	}

}
