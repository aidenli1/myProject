package com.human_3_20;

import java.util.Scanner;

public class Javaclass_03 {

	public static void main(String[] args) {
		
		
			//if문만 활용
		
//		String inputString="9";
//		while (!inputString.equals("0")) {
//			System.out.println("전체메뉴 : 1. 1번 2. 2번메뉴 3. 3번메뉴 0.종료");
//			System.out.println(">>>>>");
//			inputString= new Scanner(System.in).nextLine();
//			
//			if(inputString.equals("1")) {
//				System.out.println("1번 메뉴\n1-주문하기 2-호출하기 3-돌아가기");
//				
//				System.out.println(">>>>>");
//				inputString= new Scanner(System.in).nextLine();
//				
//				if(inputString.equals("1")) {
//					System.out.println("1 : 주문하기");
//				//	break;
//				}else if(inputString.equals("2")) {
//					System.out.println("2 : 호출하기");
//				//	break;
//					
//				}
//			}else {
//				if(inputString.equals("2")) {
//					System.out.println("2번 메뉴\n1-화면조정 2-소리조정 3-돌아가기");
//					
//					System.out.println(">>>>>");
//					inputString= new Scanner(System.in).nextLine();
//					
//					if(inputString.equals("1")) {
//						System.out.println("1 : 화면조정");
//					//	break;
//					}else if(inputString.equals("2")) {
//						System.out.println("2 : 소리조정");
//						//break;
//					}
//						
//				}else {
//					if(inputString.equals("3")) {
//						System.out.println("3번 메뉴\n1-키보드부수기 2-마우스부수기 3-돌아가기");
//						
//						System.out.println(">>>>>");
//						inputString= new Scanner(System.in).nextLine();
//						
//						if(inputString.equals("1")) {
//							System.out.println("1 : 키보드부수기");
//						//	break;
//						}else if(inputString.equals("2")) {
//							System.out.println("2 : 마우스부수기");
//							//break;
//						}
//						
//					}else {
//						if(inputString.equals("0")) {
//							System.out.println("메뉴 종료");
//						}else {
//							System.out.println("잘못입력");
//						}
//			}
//		}
//		
//	}
//
//}
//		
//	System.out.println("프로그램 종료");	
		
		
		//Q1 if문활용 조금 보탠거
		
//		String inputString="9";
//		while (!inputString.equals("0")) {
//			System.out.println("전체메뉴 : 1. 1번 2. 2번메뉴 3. 3번메뉴 0.종료");
//			System.out.println(">>>>>");
//			inputString= new Scanner(System.in).nextLine();
//			
//			if(inputString.equals("1")) {
//				System.out.println("1번 메뉴\n1-주문하기 2-호출하기 3-돌아가기");
//				
//				System.out.println(">>>>>");
//				inputString= new Scanner(System.in).nextLine();
//				
//				if(inputString.equals("1")) {
//					System.out.println("1 : 주문하기");
//					System.out.println("---------------");
//					System.out.println("1.돌아가기 2.종료");
//					System.out.println(">>>>>");
//					inputString= new Scanner(System.in).nextLine();
//					
//					if(inputString.equals("1")) {
//						continue;
//					}else if(inputString.equals("2")){
//						break;
//					}
//				}else if(inputString.equals("2")) {
//					System.out.println("2 : 호출하기");
//					System.out.println("---------------");
//					System.out.println("1.돌아가기 2.종료");
//					System.out.println(">>>>>");
//					inputString= new Scanner(System.in).nextLine();
//					
//					if(inputString.equals("1")) {
//						continue;
//					}else if(inputString.equals("2")){
//						break;
//					}
//				}
//			}else {
//				if(inputString.equals("2")) {
//					System.out.println("2번 메뉴\n1-화면조정 2-소리조정 3-돌아가기");
//					
//					System.out.println(">>>>>");
//					inputString= new Scanner(System.in).nextLine();
//					
//					if(inputString.equals("1")) {
//						System.out.println("1 : 화면조정");
//						System.out.println("---------------");
//						System.out.println("1.돌아가기 2.종료");
//						System.out.println(">>>>>");
//						inputString= new Scanner(System.in).nextLine();
//						
//						if(inputString.equals("1")) {
//							continue;
//						}else if(inputString.equals("2")){
//							break;
//						}
//					}else if(inputString.equals("2")) {
//						System.out.println("2 : 소리조정");
//						System.out.println("---------------");
//						System.out.println("1.돌아가기 2.종료");
//						System.out.println(">>>>>");
//						inputString= new Scanner(System.in).nextLine();
//						
//						if(inputString.equals("1")) {
//							continue;
//						}else if(inputString.equals("2")){
//							break;
//						}
//					}
//						
//				}else {
//					if(inputString.equals("3")) {
//						System.out.println("3번 메뉴\n1-키보드부수기 2-마우스부수기 3-돌아가기");
//						
//						System.out.println(">>>>>");
//						inputString= new Scanner(System.in).nextLine();
//						
//						if(inputString.equals("1")) {
//							System.out.println("1 : 키보드부수기");
//							System.out.println("---------------");
//							System.out.println("1.돌아가기 2.종료");
//							System.out.println(">>>>>");
//							inputString= new Scanner(System.in).nextLine();
//							
//							if(inputString.equals("1")) {
//								continue;
//							}else if(inputString.equals("2")){
//								break;
//							}
//						}else if(inputString.equals("2")) {
//							System.out.println("2 : 마우스부수기");
//							System.out.println("---------------");
//							System.out.println("1.돌아가기 2.종료");
//							System.out.println(">>>>>");
//							inputString= new Scanner(System.in).nextLine();
//							
//							if(inputString.equals("1")) {
//								continue;
//							}else if(inputString.equals("2")){
//								break;
//							}
//						}
//						
//					}else {
//						if(inputString.equals("0")) {
//							System.out.println("메뉴 종료");
//						}else {
//							System.out.println("잘못입력");
//						}
//			}
//		}
//		
//	}
//
//}
//		
//	System.out.println("프로그램 종료");
	
	
		
		//if else문 활용
		
//	String inputString="9";
//	while (!inputString.equals("0")) {
//		System.out.println("전체메뉴 : 1. 1번 2. 2번메뉴 3. 3번메뉴 0.종료");
//		System.out.println(">>>>>");
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		inputString= new Scanner(System.in).nextLine();
//		
//		
//		if(inputString.equals("1")){
//			System.out.println("1번메뉴");
//		}else if(inputString.equals("2")) {
//			System.out.println("2번메뉴");
//		}else if(inputString.equals("3")) {
//			System.out.println("3번메뉴");
//		}else if(inputString.equals("0")) {
//			System.out.println("종료");
//		}else {
//			System.out.println("잘못입력");
//		}
//	}
		
			//switch문  활용
		
		
//		String inputString="9";
//		while (!inputString.equals("0")) {
//			System.out.println("전체메뉴 : 1. 1번 2. 2번메뉴 3. 3번메뉴 0.종료");
//			System.out.println(">>>>>");
//			java.util.Scanner sc = new java.util.Scanner(System.in);
//			inputString= new Scanner(System.in).nextLine();
//		
//			
//			switch(inputString){
//				case "1" : 
//					System.out.println("1번메뉴");
//					break;
//				case "2" : 
//					System.out.println("2번메뉴");
//					break;
//				case "3" : 
//					System.out.println("3번메뉴");
//					break;
//				case "0" :
//					System.out.println("종료");
//					break;
//					
//					default : 
//						System.out.println("잘못입력");
//						break;
//			}
//}
		
		
			//Q0
		
//		boolean student[]=new boolean[50];
//		String a = "10";
//		while(!a.equals("6")) {
//			System.out.println("메뉴\n1. 전체 출석사항 2. 결석자 추가 3. 출석자 추가 6.종료");
//			System.out.println(">>>>");
//			java.util.Scanner sc = new java.util.Scanner(System.in);
//			a = new Scanner(System.in).nextLine();
//			
//			if(a.equals("1")) {
//				System.out.println("1. 전체 출석사항");
//			}else if (a.equals("2")) {
//				System.out.println("2. 결석자 추가");
//			}else if (a.equals("3")) {
//				System.out.println("3. 출석자 추가");
//			}else if (a.equals("6")) {
//				System.out.println("종료");
//			}else {
//				System.out.println("잘못입력");
//			}
//		}
		
			//Q1
		
//		int account =0;
//		String a = "1111";
//		
//		while(!a.equals("0")) {
//			System.out.println("전체메뉴\n1. 입금 2. 출금 3. 조회 0. 종료");
//			System.out.println(">>>>>");
//			java.util.Scanner sc = new java.util.Scanner(System.in);
//			a = new Scanner(System.in).nextLine();
//			
//			if(a.equals("1")) {
//				System.out.println("1번. 입금");
//				System.out.println("입금할 금액>>>>>");
//				int x = Integer.parseInt(sc.nextLine());
//				account = account+x;
//			}else {
//				if(a.equals("2")) {
//					System.out.println("2번. 출금");
//					System.out.println("출금할 금액>>>>>");
//					int x = Integer.parseInt(sc.nextLine());
//					account = account-x;
//				}else {
//					if(a.equals("3")) {
//						System.out.println("3번. 조회");
//						System.out.println(account);
//					}else {
//						if(a.equals("0")) {
//							System.out.println("종료");
//						}else {
//							System.out.println("잘못입력");
//						}
//					}
//			}
//			
//					
//			}
//			
//			
//		}
//		System.out.println("프로그램 종료");
		
		
		
		
			//Q3
		
//		int a =0;
//		
//		while(a==0) {
//			System.out.println("금액을 입력하시오 >>>");
//			java.util.Scanner sc = new java.util.Scanner(System.in);
//			int money = Integer.parseInt(sc.nextLine());
//
//		
//			int change1000= money/1000;
//			int change500= money%1000/500;
//			int change100=money%1000%500/100;
//			int change50=money%1000%500%100/50;
//			int change10=money%1000%500%100%50/10;
//		
//			System.out.println("천원짜리 : "+change1000+"개");
//			System.out.println("500원짜리"+change500+"개");
//			System.out.println("100원짜리"+change100+"개");
//			System.out.println("50원짜리"+change50+"개");
//			System.out.println("10원짜리"+change10+"개");
//			break;
//		
//		}
		
			//Q3	
				
				
//		String a ="11111";
//		int coin=0;
//		int count1=0;
//		int count2=0;
//		int count3=0;
//				
//		while(!a.equals("0")) {
//			System.out.println("전체메뉴\n1.1 사이다 700원 2.2 콜라 500원 3.3 환타 350원 4. 100원 투입 5. 500원 투입 6. 반환 0. 종료");
//			System.out.println(">>>>>");
//			java.util.Scanner sc = new java.util.Scanner(System.in);
//			a = new Scanner(System.in).nextLine();
//				
//			if(a.equals("1")) {
//				coin=coin-700;
//				count1++;
//			}else {
//				if(a.equals("2")) {
//					coin=coin-500;
//					count2++;
//				}else {
//					if(a.equals("3")) {
//						coin=coin-350;
//						count3++;
//					}else {
//						if(a.equals("4")) {
//							coin=coin+100;
//						}else {
//							if(a.equals("5")) {
//								coin=coin+500;
//							}else if(a.equals("6")) {
//								System.out.println("현재 금액"+coin+"원");
//							}else if (a.equals("0")) {
//								System.out.println("종료");
//							}
//						}
//					}
//				}
//			}
//			
//		}
//		int change1000= coin/1000;
//		int change500= coin%1000/500;
//		int change100=coin%1000%500/100;
//		int change50=coin%1000%500%100/50;
//		
//		System.out.println("천원 : "+change1000+"개");
//		System.out.println("오백원 : "+change500+"개");
//		System.out.println("백원 : "+change100+"개");
//		System.out.println("오십원 : "+change50+"개");
//		System.out.println("------------------------");
//		
//		System.out.println("사이다 : "+count1+"개");
//		System.out.println("콜라 : "+count2+"개");
//		System.out.println("환타 : "+count3+"개");
		
				
				
				

		
		//Q4
		

//		String arr[]=new String[100];
//		for(int i =1;i<101;i++) {
//			
//			int a= i/10;
//			int b= i%10;
//			
//			if(a==3 || a==6 || a==9) {
//				if(b==3 || b==6 || b==9) {
//					System.out.println("짝짝");	
//					continue;
//				}
//				System.out.println("짝");
//				}
//			else if (b==3|| b==6 || b==9){
//				System.out.println("짝");
//			}
//				else {
//					System.out.println(i+"");
//				}
//			}


		
		//Q5
		
		
		

		
		
		
		
		
		
		//Q6
		
//		int adul=0;
//		int chil =0;
//		int silv =0;
//		int aMoney=0;
//		int cMoney=0;
//		int sMoney=0;
//		
//		
//		
//		String a = "1111";
//		String b = "1111";
//		
//			while(!a.equals("0")) {
//				
//				System.out.println("주간권     오후권   윈터야간권    2일권");
//				System.out.println("종류를 선택하시오 >>>>>");
//				System.out.println("종료를 원하시면 0 을 눌러주세요");
//				java.util.Scanner sc = new java.util.Scanner(System.in);
//				a = new Scanner(System.in).nextLine();
//				
//				if(a.equals("주간권")) {
//					System.out.println("종류 :      1.대인     2.청소년     3.노인");
//					System.out.println(">>>>>");
//				b = new Scanner(System.in).nextLine();
//					
//					if(b.equals("1")) {
//						adul++;
//						aMoney=aMoney+46000;
//					}else if(b.equals("2")) {
//							chil++;
//							cMoney=cMoney+39000;
//						}else if(b.equals("3")) {
//								silv++;
//								sMoney=sMoney+36000;
//								
//							}
//							
//					}else if(a.equals("오후권")) {
//					System.out.println("종류 :      1.대인     2.청소년     3.노인");
//					System.out.println(">>>>>");
//				b = new Scanner(System.in).nextLine();
//				
//				if(b.equals("1")) {
//					adul++;
//					aMoney=aMoney+38000;
//				}else if(b.equals("2")) {
//						chil++;
//						cMoney=cMoney+32000;
//					}else if(b.equals("3")) {
//							silv++;
//							sMoney=sMoney+29000;
//						}
//						
//						
//				}else if(a.equals("윈터야간권")) {
//					System.out.println("종류 :      1.대인     2.청소년     3.노인");
//					System.out.println(">>>>>");
//				b = new Scanner(System.in).nextLine();
//				
//				if(b.equals("1")) {
//					adul++;
//					aMoney=aMoney+20000;
//				}else if(b.equals("2")) {
//						chil++;
//						cMoney=cMoney+17000;
//					}else if(b.equals("3")) {
//							silv++;
//							sMoney=sMoney+16000;
//					
//			}
//				}else if(b.equals("2일권")) {
//					System.out.println("종류 :      1.대인     2.청소년     3.노인");
//					System.out.println(">>>>>");
//				b = new Scanner(System.in).nextLine();
//				
//				if(b.equals("1")) {
//					adul++;
//					aMoney=aMoney+74000;
//				}else if(b.equals("2")) {
//						chil++;
//						cMoney=cMoney+62000;
//					}else if(b.equals("3")) {
//							silv++;
//							sMoney=sMoney+58000;
//					
//			
//			}
//				}else if(a.equals("0")) {
//					System.out.println("종료합니다. 감사합니다링~~~~~~~~ㅋㅋㅋㅋㅋㅋㅋㅋ");
//				}else {
//					System.out.println("잘못입력");
//				}
//			}
//			
//			System.out.println("대인"+adul+"명"+aMoney+"원");
//			System.out.println("청소년"+chil+"명"+cMoney+"원");
//			System.out.println("노인"+silv+"명"+sMoney+"원");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			//Q7
		
//		int com = 0;
//		com =(int)(Math.random()*5+1);
//		int count1=0;
//		int countcom =0;
//		int countme =0;
//		
//		for(int i =1; i<11;i++) {
//			System.out.println("1~5 선택");
//			System.out.println(">>>>>>>>");
//		java.util.Scanner sc = new java.util.Scanner(System.in);
//		int me =Integer.parseInt(sc.nextLine());
//		
//		if(com==me) {
//			count1++;
//		}else if(com>me) {
//			countcom++;
//			System.out.println(" -com win- ");
//		}else if(com<me) {
//			countme++;
//			System.out.println(" -me win- ");
//		}else {
//			System.out.println("잘못입력");
//		}
//		
//		}
//		System.out.println("v-com win-v : "+countcom);
//		System.out.println("v- me win-v : "+countme);
//		System.out.println("--같은 횟수-- : "+count1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
