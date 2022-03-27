package com.human_3_26;

public class Sordupgrade_01 {

	public static void main(String[] args) {
		
		int money=1000000; //100만
		int upmoney = 300; //강화비용
		int sell =100;	   //판매비용
		int star = 1; 	   //등급
		int percent = 90;  //확률
		
		String name2 = "장미칼";
		String name3 = "빼빼로";
		String name4 = "뽀로로칼";
		String name5 = "오월의 한";
		String name6 = "진격의 검";
		String name7 = "칠흑";
		String name8 = "노장의 검";
		String name9 = "비둘기의 검";
		String name10 ="개쩌는 검";
		String name11 ="강화된 빼빼로";
		String name12 ="아만타디움 검";
		String name13 ="13난쟁이의 검";
		String name14 ="전설의 세번째 검";
		String name15 ="이거 나오면 ㄹㅇ복권사셈";
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("검 강화하기");
		System.out.println("모드 선택 : 1. 이지모드  2. 하드모드 0. 종료");
		System.out.println(">>>>>>>");
		
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("");
		
		if(a==1) {
			System.out.println("-이지모드 선택");
			System.out.println("");
			
			
			while(a!=0) {
				
				int rrd = 1;
				rrd = (int)(Math.random()*100); // 랜덤값(확률)
			
			if(star==1) {
				System.out.println("칼 이름 : 식칼");
				System.out.println("");
			}
			System.out.println(String.format("메뉴 : 1. 강화하기 비용 : %d원  2. 판매하기 비용 : %d원  0. 종료",upmoney,sell));
			System.out.println(String.format("현재 보유 금액 : %d원",money));
			System.out.println(">>>>>>>");
			int b = Integer.parseInt(sc.nextLine());
			System.out.println("");
			
			if(b==1) {
				System.out.println("-강화하기 선택");
				System.out.println("");
				money= money -upmoney;
				
				if(rrd<percent) {
					percent=percent-5;
					System.out.println("랜덤값 : "+rrd);
					System.out.println("확률 : "+percent);
					System.out.println("");
					
					upmoney= upmoney*2;
					sell= sell*3;
					star++;
					
					System.out.println("★☆★★☆★★☆★★☆★");
					System.out.println("★☆★강화성공★☆★");
					System.out.println("★☆★★☆★★☆★★☆★");
					System.out.println("");
					
					System.out.println(String.format("현재 등급 : %d 성",star));
					System.out.println("");
					
					if(star==2) {
						System.out.println(String.format("칼 이름 : %s",name2)+"\n");
					}else if(star==3) {
						System.out.println(String.format("칼 이름 : %s",name3)+"\n");
					}else if(star==4) {
						System.out.println(String.format("칼 이름 : %s",name4)+"\n");
					}else if(star==5) {
						System.out.println(String.format("칼 이름 : %s",name5)+"\n");
					}else if(star==6) {
						System.out.println(String.format("칼 이름 : %s",name6)+"\n");
					}else if(star==7) {
						System.out.println(String.format("칼 이름 : %s",name7)+"\n");
					}else if(star==8) {
						System.out.println(String.format("칼 이름 : %s",name8)+"\n");
					}else if(star==9) {
						System.out.println(String.format("칼 이름 : %s",name9)+"\n");
					}else if(star==10) {
						System.out.println(String.format("칼 이름 : %s",name10)+"\n");
					}else if(star==11) {
						System.out.println(String.format("칼 이름 : %s",name11)+"\n");
					}else if(star==12) {
						System.out.println(String.format("칼 이름 : %s",name12)+"\n");
					}else if(star==13) {
						System.out.println(String.format("칼 이름 : %s",name13)+"\n");
					}else if(star==14) {
						System.out.println(String.format("칼 이름 : %s",name14)+"\n");
					}else if(star==15) {
						System.out.println(String.format("칼 이름 : %s",name15)+"\n");
					}
					
				}else {
					System.out.println("랜덤값 : "+rrd);
					System.out.println("확률 : "+percent);
					System.out.println("");
					
					System.out.println("-------");
					System.out.println("|강화실패|");
					System.out.println("-------");
					System.out.println("");
					
					System.out.println(String.format("현재 보유 금액 : %d 원",money));
					System.out.println("");
					
					star = 1;
					upmoney=300;
					sell=100;
					percent=90;
					
				}
			}else if(b==2) {
				money=money+sell;
				
				System.out.println("-판매하기 선택");
				System.out.println("");
				
				System.out.println("판매 금액 : "+sell+"원");
				System.out.println(String.format("현재 보유 금액 : %d 원",money));
				System.out.println("");
				star = 1;
				upmoney=300;
				sell=100;
				percent=90;
				
			}else if(b==0) {
				System.out.println("종료합니다링");
				break;
			}else {
				System.out.println("잘못입력");
				System.out.println("");
			}
			
			
			
			}
		}
		
		
		
		else if(a==2) {
			System.out.println("-하드모드 선택");
		}else if(a==0) {
			System.out.println("종료합니다");
			
		}else {
			System.out.println("잘못입력");
		}
		
	}

}
