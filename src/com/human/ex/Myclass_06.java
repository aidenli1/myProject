package com.human.ex;

//import com.human.dto. *; //줄여줄 클래스를 상단에 기술하면 됌. 패키지 속의 모든 클래스 생략
import com.human.dto.Chicken; //지정된 클래스만 생략
//import com.human.dto.Human2;

public class Myclass_06 {

	public static void main(String[] args) {
		// 3.10 목
		
		
		// 다른 패키지에 있을 경우 패키지 풀네임을 기재햐아함.
		// ex >> (com.human.dto.Human2  x2 = new com.human.dto.Human2();)
		
		
//		Car c1 = new Car();
//		c1. name = "소나타";
//		c1. brand = "현대";
//		c1. price = 30000000;
//		
//		Car c2 = new Car();
//		c2. name = "봉고";
//		c2. brand = "기아";
//		c2. price = 20000000;
//		
//		Car c3 = new Car();
//		c3. name = "E class";
//		c3. brand = "벤츠";
//		c3. price = 60000000;
//		
//		System.out.println("차종 :"+c3.name);
//		System.out.println("제조사:"+c3.brand);
//		System.out.println("가격 :"+c3.price);
		
		Chicken c1 = new Chicken();
		c1. name = "교촌 허니 콤보";
		c1. price = 19000;
		c1. kcal = 2700;
		
		Chicken c2 = new Chicken();
		c2. name = "굽네 고추 바사삭";
		c2. price = 19500;
		c2. kcal = 2800;
		
		Chicken c3 = new Chicken();
		c3. name = "bhc 황금 올리브";
		c3. price = 18000;
		c3. kcal = 2750;
		
		System.out.println("메뉴이름 :"+c1.name);
		System.out.println("메뉴가격 :"+c1.price+"원");
		System.out.println("메뉴 칼로리 :"+c1.kcal+"kcal");
		
	}

}
