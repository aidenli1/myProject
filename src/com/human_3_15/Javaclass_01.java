package com.human_3_15; //조건문과 논리연산자


public class Javaclass_01 {

	public static void main(String[] args) {

		//모두 만족해야 할 경우&&(and)사용
		//하나만 만족해도 되는 경우 ||(or)사용
		
		//21p Q1
		//비밀번호가 111이고 key는 "108호"키
		/*
		 1. 둘다 입력해야 들어갈수 있음
		 2. 둘중 하나만 맞으면 들어갈수잇음
		 3. 비밀번호만 맞으면 들어갈수있음
		 4. 키만 맞으면 들어갈수있
		 */
		
//		int num = 111;
//		String key = "108호";
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		int numInput=Integer.parseInt(sc.nextLine());
//		String keyInput = sc.nextLine();
//		
//		if(num==numInput&&key.equals(keyInput)) {
//			System.out.println("들어감");
//		}else {
//			System.out.println("못 들어감");
//		}
		
		
			//1.
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		int numInput=Integer.parseInt(sc.nextLine());
//		String keyInput = sc.nextLine();
//		
//		if(num==111&&key.equals("108호")) {
//			System.out.println("들어감");
//		}else {
//			System.out.println("못 들어감");
//		}
		
			//2.
//		if(num==111||key.equals("108호")) {
//			System.out.println("들어감");
//		}else {
//			System.out.println("못 들어감");
//		}
		
		
			//3.
//		if(num==111||key.equals("108호")) {
//			System.out.println("들어감");
//		}else {
//			System.out.println("못 들어감");
//		}
		
		
		
			//4.
//		if(num==111||key.equals("108호")) {
//			System.out.println("들어감");
//		}else {
//			System.out.println("못 들어감");
//		}
		
		
		//입력값에 따라 동일한 결과가 나오도록 조건식 작성
		
//		boolean isFlag1=true, isFlag2=true;//입력값
//		
//		if(isFlag1) {
//			if(isFlag2) {//&&
//				System.out.println("O"); //o//x
//			}else {
//				System.out.println("X"); //o//x
//			}
//		}else {
//			if(isFlag2) {
//				System.out.println("X"); //o//x
//			}else {
//				System.out.println("x"); //x//o
//			}
//		}
		
//		if(조건) { ?
//			System.out.println("O");//출력값이 상위 코드와 동일하게 동작하도록
//		}else {
//			System.out.println("X");
//		}
		
		//이해못함 다시공부
		
		
//		boolean isFlag1=false, isFlag2=false;//입력값
//		
//		if(isFlag1) {
//			if(isFlag2) {
//				System.out.println("x"); 
//			}else {
//				System.out.println("o"); 
//			}
//		}else {
//			if(isFlag2) {
//				System.out.println("o"); 
//			}else {
//				System.out.println("o"); 
//			}
//		}
//		
//		if(!(isFlag1||isFlag2)) {
//				System.out.println("O"); 
//			}else {
//				System.out.println("X"); 
//			}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			//Q1
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		
//		
//		if(a>15) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
			//Q2
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println(">>>>");
//		int b = Integer.parseInt(sc.nextLine());
//	
//		if(!(a>=12 && b<22)) {
//			System.out.println("O");
//		}else
//			System.out.println("x");
		
		
			//Q2_02
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println(">>>>");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		
//		if(a <13 || b> 23) {
//			System.out.println("o");
//		}else
//			System.out.println("x");
		
		
		
		
		
			//Q3
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println(">>>>");
//		int a = Integer.parseInt(sc.nextLine());
//
//		
//		if((a%3==0||a%7==0)&&(a%2==0&&a%5==0)) {
//			System.out.println("둘다 만족");
//			
//		}else if(a%3==0||a%7==0) {
//			System.out.println("3 또는 7의 배수");
//		}else if (a%2==0&&a%5==0) {
//			System.out.println("2 와 5의 배수");
//		}else {
//			System.out.println("해당없음");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
			//Q4
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("x >>>>");
//		int x = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("y >>>>");
//		int y = Integer.parseInt(sc.nextLine());
		
		
			//Q4
		
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("age >>>>");
//		int age = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("버스카드 유무 >>>>(true/false)");
//		
//		boolean a = Boolean.parseBoolean(sc.nextLine());
//
//	
//		if(age<=15 && a==true) {
//			System.out.println("버스요금은 " + 1200+"원 입니다.");
//		}else if(age<=15 && !a==true) {
//			System.out.println("버스요금은 " + 1300+"원 입니다.");
//		}else if(age>15 && a==true) {
//			System.out.println("버스요금은 " + 1500+"원 입니다.");
//		}else if(age>15 && !a==true) {
//			System.out.println("버스요금은 " + 1600+"원 입니다.");
//		}else {
//			System.out.println("오류");
//		}
			
		
		

		
		
		
			//Q6
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("밥먹음?>>>>> \n 밥먹음 \n 빵먹음 \n >>>>");
//		String a = sc.nextLine();
//	
//		switch(a) {
//		//a.
//		case "밥먹음":
//			System.out.println("밥을먹었음");
//			break;
//		
//			default:
//				System.out.println("아무것도안먹음");
//				break;
//		
//		//b.
//		case "빵먹음":
//			System.out.println("빵을먹었음");
//			break;
//			default:
//				System.out.println("밥을먹었음");
//				break;
//		
//		//c.
//		case "밥먹음":
//			System.out.println("밥을먹었음");
//			break;
//			default:
//				System.out.println("빵을먹었음");
//				break;
//				
//				//d.
//		case "밥먹음":
//			System.out.println("밥을먹었음");
//			break;
//			default:
//				System.out.println("아무것도안먹음");
//				break;
//				
//				
//				//e.
//				
//			case "밥":
//				System.out.println("국 or 아이스크림");
//				break;
//			case "빵":
//				System.out.println("우유 or 커피");
//				break;
//				
//		}
		
		
		
		//Q7
		
//		int s=90;
//		int m =95;
//		int l=100;
//		int xl=105;
//		int xxl=110;
//		
//		
//		if(s>=90 && s<95) {
//			System.out.println("S");
//		}
//		if(m>=95 && m<100) {
//			System.out.println("M");
//		}
//		if(l>=100 && l<105) {
//			System.out.println("L");
//		}
//		if(xl>=105 && xl<110) {
//			System.out.println("XL");
//		}
//		if(xxl>=110) {
//			System.out.println("XXL");
//		}
		
			//Q8
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		System.out.println("jaca sccore >>>>");
//		int j = Integer.parseInt(sc.nextLine());
//		System.out.println("html sccore >>>>");
//		int h = Integer.parseInt(sc.nextLine());
//		System.out.println("db sccore >>>>");
//		int d = Integer.parseInt(sc.nextLine());
//		
//		int s = (j+h+d)/3;
//		if(s>=60) {
//			if(j<60||h<60||d<60) {
//				System.out.println("과락");
//			}else {
//				System.out.println("총점 "+s+"점 60점 이상 합격");
//			}
//		}else {
//			System.out.println("총점 "+s+"점 60점 미만  불합격");
//		}
		
		
		
		
	//	System.out.println("총점 "+s+"점 60이상 합격");
//	}else if(j<=40) {
//		System.out.println("총점 "+s+"점 60이상 합격");
		
		
		
			//Q9
		
//				java.util.Scanner sc = new java.util.Scanner(System.in);
//				
//				System.out.println("age >>>>");
//				int age = Integer.parseInt(sc.nextLine());
//				
//				System.out.println("height >>>>");
//				int x = Integer.parseInt(sc.nextLine());
//				
//				System.out.println("weight >>>>");
//				int y = Integer.parseInt(sc.nextLine());
//				
//				double a = (((x-100)*0.9)/y)*100;
//				
//				if (age<20) {
//					if(a>120) {
//						System.out.println("정상 체중");
//					}else if (a>=120&&a<=130) {
//						System.out.println("경도 비만");
//					}else if (a>=130&&a<=150) {
//						System.out.println("중도 비만");
//					}else {
//						System.out.println("고도 비만");
//					}
//				}else {
//					if(a>95) {
//						System.out.println("체중 미달");
//					}else if(a>=100&&a<=110) {
//						System.out.println("정상 체중");
//					}else if(a>=110&&a<=120) {
//						System.out.println("과체중");
//					}else if(a>=120&&a<=150) {
//						System.out.println("비만");
//					}else {
//						System.out.println("고도 비만");
//					}
//				}
					
			//Q10
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println("size >>>>");
//		int chest = Integer.parseInt(sc.nextLine());
//		
//		if(chest>=86 && chest<=95) {
//			System.out.println("S");
//		}else if (96 <= chest && chest<=106) {
//			System.out.println("M");
//		}else if (chest>=107 && chest<=116) {
//			System.out.println("L");
//		}else if (chest>=117 && chest<=126) {
//			System.out.println("XL");
//		}else if (chest>=127 && chest<=132) {
//			System.out.println("XXL");
//		}else {
//			System.out.println("다시입력");
//		}
		
		//Q11
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println("값 입력 >>>>");
//		int x = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("연산자 선택 >>>>");
//		String sum = (sc.nextLine());
//		
//		System.out.println("두번째 값 입력 >>>>");
//		int z = Integer.parseInt(sc.nextLine());
//		
//		
//		switch(sum) {
//		case  "+" :
//			System.out.println(x+z);
//			break;
//		case  "-" :
//			System.out.println(x-z);
//			break;
//		case  "*" :
//			System.out.println(x*z);
//			break;
//		case  "/" :
//			System.out.println(x/z);
//			break;
//			default :
//				System.out.println("다시입력");
//		}
		
		
		
		
			//Q12
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		
//		
//
//		a = ((int)(Math.random()*3+1)); //찌
//		b = ((int)(Math.random()*3+1)); //빠
//		c = ((int)(Math.random()*3+1)); //묵
//		
//		if(a>b) {
//			if(a>c) {
//				System.out.println("찌 승");
//			}else if (b>a) {
//				System.out.println("빠 승");
//			}else {
//				System.out.println("묵 승");
//			}
//		}else if(b>c) {
//			System.out.println("빠 승");
//		}else {
//			System.out.println("묵 승");
//		}
		
			//Q13
		
		
		
//		System.out.println(((int)(Math.random()*5+6)));
		
			//Q14.로또
		
//		System.out.println(((int)(Math.random()*45+1)));
//		System.out.println(((int)(Math.random()*45+1)));
//		System.out.println(((int)(Math.random()*45+1)));
//		System.out.println(((int)(Math.random()*45+1)));
//		System.out.println(((int)(Math.random()*45+1)));
//		System.out.println(((int)(Math.random()*45+1)));
		
		
		
			//Q15.
		
		
//		int a = ((int)(Math.random()*3+1)); //찌
//		
//		switch(a){
//		case 1 :
//			System.out.println("묵");
//		break;
//		case 2 :
//			System.out.println("찌");
//			break;
//		case 3 :
//			System.out.println("빠");
//			break;
//		}
		
		
		//Q16
		
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println("값 입력(만단위생략) >>>>");
//		double x = Double.parseDouble(sc.nextLine());
//		
//		
//		double a = (x*600);
//		double b = (x*1500);
//		double c = (x*2400);
//		double d = (x*3500);
//		double f = (x*3800);
//		double e = (x*4000);
//		double g = (x*4200);
//		
//		if(x<=1200) {
//			System.out.println("낼 세금은 "+a+"원 입니다.");
//		}else if (x>= 1200 && x<= 4600) {
//			System.out.println("낼 세금은 "+b+"원 입니다.");
//		}else if (x> 4600 && x<= 8800) {
//			System.out.println("낼 세금은 "+c+"원 입니다.");
//		}else if (x> 8800 && x<= 150000) {
//			System.out.println("낼 세금은 "+d+"원 입니다.");
//		}else if (x> 15000 && x<= 30000) {
//			System.out.println("낼 세금은 "+e+"원 입니다.");
//		}else if (x> 30000 && x<= 50000) {
//			System.out.println("낼 세금은 "+f+"원 입니다.");
//		}else {
//			System.out.println("낼 세금은 "+g+"원 입니다.");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		//선생님 풀이
		//Q1
		
//		int i = 15;
//		if(i>14) {
//			System.out.println(i);
//		}
		
		//Q2
		
//		int i =0;
//		
//		if(!(i<=12||i>22)) {
//			System.out.println(i);
//		}
//		
//		if(!(i>=9&&i>5)) {
//			
//		}
		
		
		//Q3
		
//		int i = 23;
//		
//		if(i%3==0||i%7==0) {
//			System.out.println("3or7");
//		}
//		if(i%2==0&&i%5==0) {
//			System.out.println("2or5");
//		}
		
		
		//Q5
		
		
		
		
//		System.out.println("나이");
//		int age= Integer.parseInt(new java.util.Scanner(System.in).nextLine());
//		System.out.println("교통카드 유뮤");
//		boolean card= Boolean.parseBoolean(new java.util.Scanner(System.in).nextLine());
//		
//		int change = 0;
//		
//		if(age<15) {
//			change=1300;
//		}else {
//			change=1600;
//		}
//		if(card) {
//			change=change-100;
//		}
//		System.out.println(change);
		
		
		
		
		//Q6
		
//		int i =(new java.util.Date()).getDay();
//		System.out.println(i);
//		
//		switch(i) {
//		case 0 :
//			System.out.println("일");
//			break;
//		case 1 :
//			System.out.println("월");
//			break;
//		case 2 :
//			System.out.println("화");
//			break;
//		case 3 :
//			System.out.println("수");
//			break;
//		case 4 :
//			System.out.println("목");
//			break;
//		case 5 :
//			System.out.println("금");
//			break;
//		case 6 :
//			System.out.println("토");
//			break;
//			
//		}
		
		
		//Q12
		
//		System.out.println(Math.random()*10);//0<=x<10
//		System.out.println((int)(Math.random()*10+10));//10<=x<20
//		
//		System.out.println((int)(Math.random()*3+1));
		
		
		
		
		//Q14
		
//		int input = 60000000;
//		int tax=0;
//		if(input>500000000) {
//			tax = (int)((input-500000000)*0.42);
//			input = 500000000;
//		} 
//		
//		if(input>300000000) {
//			tax = tax+(int)((input-300000000)*0.40);
//			input=300000000;
//		}
		
		
		
		
		
		
		
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		
//		System.out.println("값 입력(만단위생략) >>>>");
//		double money = Double.parseDouble(sc.nextLine());
//		
//		
//		System.out.println("―――――――――――――――――――누진공제액 차감 방식――――――――――――――――――――――――");
//		int taxOri,dedu;
//		int tax = 0;
//		if(money<=12000000) { 
//			tax=(int)(money*0.06); 
//			System.out.println(String.format("%d원입니다",tax));
//		}else if(money<46000000) {
//			taxOri=(int)(money*0.15);
//			dedu=1080000;
//			tax=taxOri-dedu;			
//			System.out.println(String.format("기본세금 %d에서 누진공제액 %d을 차감한",taxOri,dedu));			
//			System.out.println(String.format("%d원 입니다",tax));
//		}else if(money<88000000) {
//			taxOri=(int)(money*0.24);
//			dedu=5220000;
//			tax=taxOri-dedu;			
//			System.out.println(String.format("기본세금 %d에서 누진공제액 %d을 차감한",taxOri,dedu));			
//			System.out.println(String.format("%d원 입니다",tax));
//		}else if(money<150000000) {			 
//			taxOri=(int)(money*0.35);
//			dedu=14900000;
//			tax=taxOri-dedu;			
//			System.out.println(String.format("기본세금 %d에서 누진공제액 %d을 차감한",taxOri,dedu));			
//			System.out.println(String.format("%d원 입니다",tax));
//		}else if(money<300000000) {			
//			taxOri=(int)(money*0.38);
//			dedu=19400000;
//			tax=taxOri-dedu;			
//			System.out.println(String.format("기본세금 %d에서 누진공제액 %d을 차감한",taxOri,dedu));			
//			System.out.println(String.format("%d원 입니다",tax));
//		}else if(money<500000000) {			
//			taxOri=(int)(money*0.4);
//			dedu=25400000;
//			tax=taxOri-dedu;			
//			System.out.println(String.format("기본세금 %d에서 누진공제액 %d을 차감한",taxOri,dedu));			
//			System.out.println(String.format("%d원 입니다",tax));
//		}else {			
//			taxOri=(int)(money*0.42);
//			dedu=35400000;
//			tax=taxOri-dedu;			
//			System.out.println(String.format("기본세금 %d에서 누진공제액 %d을 차감한",taxOri,dedu));			
//			System.out.println(String.format("%d원 입니다",tax));
//		}
//	}
//
//		
//		
//		
//}	
		
		
		
		
		
		
		
		
		
		
	}
}



