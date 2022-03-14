package com.human_3_14;//3.13일 예습

public class Javaclass_01 {

	public static void main(String[] args) {
		
			//While문
		
//		int i = 0;
//		while (i<10) {
//			System.out.println("Hi"+ i);
//			i++;
//		}

			//for문
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Coding Everybody" + (i+1)*3);
//		}
		
		
			//break
		
//		for (int i = 0; i <10; i++) {
//			if (i == 5)
//				break; //true 일 경우 반복을 깨고 바로 종료
//			System.out.println("Coding Everybody"+ i);
//		}
		
			//continue
		
//		for (int i = 0; i <10; i++) {
//			if (i == 5)
//				continue; //true일 경우 해당 부분만 빼고 다음 반복 실행
//			System.out.println("Coding Everybody"+ i);
//		}
		
		
			//반복문의 중첩
		
		for (int i =0; i < 10; i++) {//안에 있는 for문이 반복이 끝날때 실행.
			for (int j = 0; j <10; j++) { //안에 있는 for문이 먼저 실행.
				System.out.println(i + "" + j);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
