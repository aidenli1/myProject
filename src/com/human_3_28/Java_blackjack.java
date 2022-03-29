package com.human_3_28;

import java.util.Arrays;

public class Java_blackjack {

	public static void main(String[] args) {
		
		//카드 모양
		String [] cardShape= {"하트","스페이드","다이아","클로버"};
		//카드숫자
		String [] cardNumber= {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		System.out.println(Arrays.toString(cardShape));
		System.out.println(Arrays.toString(cardNumber));
		
		
		int[]deck=new int [52];
		
		for(int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
		
//		for(int i=0;i<10000; i++) { //카드 셔플
//			int randomCard=(int)(Math.random()*52);
//			int cardTemp=deck[0];
//			deck[0]= deck[randomCard];
//			deck[randomCard]=cardTemp;
//			}
		
		for(int i=0;i<deck.length;i++) {
			System.out.println(deck[i]+":"+ cardShape[deck[i]/13]+cardNumber[deck[i]%13]);
		}
		
		int deckIndex=0; //deck카드 묶음에서 카드 사용 유무한  구분 인덱스
		
		int []p1Deck = new int[12]; //플레이어 1의 카드 묶
		int []p2Deck = new int[12]; //플레이어 2의 카드 묶
		int p1DeckIndex=0; //플레이어 1의 카드 개
 		int p2DeckIndex=0; //플레이어 2의 카드 개
		
		//deck에서 카드 한장씩 꺼내서 p1과 p2에 2장씩 주고
 		//p1과 p2가 가지고 있는 카드를 출력해보자.
 		
// 		for(int x=0;x<12;x++) {
// 		p1Deck[p1DeckIndex]=deck[deckIndex];
// 		p1DeckIndex++;
// 		deckIndex++;
// 		System.out.println("p1 : "+Arrays.toString(p1Deck));
// 		
// 		p2Deck[p2DeckIndex]=deck[deckIndex];
// 		p2DeckIndex++;
// 		deckIndex++;
// 		System.out.println("p2 : "+Arrays.toString(p2Deck));
// 		}
// 	
//		System.out.println("--------------------");
//		
//		p1Deck[p1DeckIndex++]=deck[deckIndex++];
//		p2Deck[p2DeckIndex++]=deck[deckIndex++];
//		
//		java.util.Scanner sc= new java.util.Scanner(System.in);
//		System.out.println("1.시작 0.종료");
//		int a = Integer.parseInt(sc.nextLine());
//		
//		while(a!=0) {
//			System.out.println("플레이어 1 turn");
//			System.out.println("1.받기 2.스돕");
//			int go = Integer.parseInt(sc.nextLine());
//		
//		if(go==1) {
// 		
//		System.out.println("p1 card");
//		for(int i=0;i<p1DeckIndex;i++) {
//			System.out.println(p1Deck[i]+":"+ cardShape[p1Deck[i]/13]+cardNumber[p1Deck[i]%13]);
//			System.out.println("");
//			}
//		
//		}else if(go==2) {
//			System.out.println("스돕");
//			break;
//		}
//		System.out.println("플레이어 2 turn");
//		System.out.println("1.받기 2.스돕");
//		int go2 = Integer.parseInt(sc.nextLine());
//		
//		if(go2==1) {
//		System.out.println("p2 card");
//		for(int i=0;i<p2DeckIndex;i++) {
//			System.out.println(p2Deck[i]+":"+ cardShape[p2Deck[i]/13]+cardNumber[p2Deck[i]%13]);
//			System.out.println("");
//			}
//		}else if(go2==2) {
//			System.out.println("스돕");
//			break;
//		}
//		}
		
		
		
		
		
		
		
		
		
		
		//쌤풀이
 		
// 		System.out.println("Black Jack");
// 		System.out.println("----------------------");
// 		System.out.println("------Game Start------");
// 		System.out.println("----------------------");
// 		System.out.println("");
// 		
//		boolean isp1PlayFlag=true;
//		boolean isp2PlayFlag=true;
//		
//		int p1Sum=0;
// 		int p2sum=0;
//		
//		
//		while((isp1PlayFlag || isp2PlayFlag)&& p1DeckIndex!=p1Deck.length && p2DeckIndex != p2Deck.length ){
//			if(isp1PlayFlag) {
//			System.out.println("p1  카드 받을래? 1. ㅇㅇ 2. ㄴㄴ");
//			System.out.println("");
//			System.out.println(">>>>>>>");
//			
//			String input = new java.util.Scanner(System.in).nextLine();
//			if(input.equals("1")) {
//			p1Deck[p1DeckIndex++]=deck[deckIndex++];
//			}else {
//				isp1PlayFlag=false;
//			//	break;
//			}
//			
//		}
//			for(int i=0; i<p1DeckIndex;i++) {
//				System.out.println(cardShape[p1Deck[i]/13]+
//						cardNumber[p1Deck[i]%13]);
//				System.out.println("");
//			}
//			
//			if(isp2PlayFlag) {
//				System.out.println("p2  카드 받을래? 1. ㅇㅇ 2. ㄴㄴ");
//				System.out.println("");
//				System.out.println(">>>>>>>");
//				
//				String input = new java.util.Scanner(System.in).nextLine();
//				if(input.equals("1")) {
//					p2Deck[p2DeckIndex++]=deck[deckIndex++];
//					
//				}else {
//					isp1PlayFlag=false;
//					break;
//				}	
//			}
//			for(int i=0; i<p2DeckIndex;i++) {
//				System.out.println(cardShape[p2Deck[i]/13]+
//						cardNumber[p2Deck[i]%13]);
//				System.out.println("");
//			}
//		}
//		
//		
//		
//			System.out.println("p1 Card : ");
//			System.out.println("");
//			for(int i=0; i<p1DeckIndex;i++) {
//				System.out.println(cardShape[p1Deck[i]/13]+
//						cardNumber[p1Deck[i]%13]);
//				System.out.println("");		
//			}
//			for(int i=0;i<p1DeckIndex;i++) {
//				int score=0;
//				//a=11
//				if(p1Deck[i]%13==0) {
//					score=score+11;
//				}else if(p1Deck[i]%13<9) {
//					score=p1Deck[i]%13+1;
//				}else {
//					score=score+10;
//				}
//				p1Sum= p1Sum+score;
//			
////				if(p1Sum>21) { //21점 넘으면 게임 지게 설정
////					break;
////				}
//			}
//			
//			System.out.println("총점은 : "+p1Sum);
//			System.out.println("");
//			
//			//1이 1이냐 10이냐 설정
//			if(p1Sum>21) {
//				for(int i=0;i<p1DeckIndex;i++) {
//					if(p1Sum>21) {
//					p1Sum = p1Sum-10;
//					}
//				}
//					
//			}
//			
//			
//			System.out.println("p2 Card : ");
//			System.out.println("");
//			for(int i=0; i<p2DeckIndex;i++) {
//				System.out.println(cardShape[p2Deck[i]/13]+
//						cardNumber[p2Deck[i]%13]);
//				System.out.println("");
//				
//			}
//			for(int i=0;i<p2DeckIndex;i++) {
//				int score=0;
//				//a=11
//				if(p2Deck[i]%13==0) {
//					score=score+11;
//				}else if(p2Deck[i]%13<9) {
//					score=p2Deck[i]%13+1;
//				}else {
//					score=score+10;
//				}
//				p2sum= p2sum+score;
//				
//				
//			}
//			System.out.println("총점은 : "+p2sum);
//			System.out.println("");
//			
//			if(p2sum>21) {
//				for(int i=0;i<p2DeckIndex;i++) {
//					if(p2sum>21) {
//						p2sum = p2sum-10;
//						}
//					}
//				
//				}
////			
//			if(p1Sum==21) {
//				System.out.println("--플레이어 1 승1");
//			}else if(p2sum==21){
//				System.out.println("--플레이어 2 승2");
//			}else if(p1Sum<21 && p1Sum>p2sum) {
//				System.out.println("--플레이어 1 승3");
//			}else if(p2sum<21 && p2sum>p1Sum) {
//				System.out.println("--플레이어 2 승4");
//			}else if(p1Sum>21 && p2sum >21) {
//				if(p1Sum>p2sum) {
//					System.out.println("--플레이어 2 승5");
//				}else if(p2sum>p1Sum) {
//					System.out.println("--플레이어 1 승6");
//				}
//			}
//			
//			
//			
//			//21 break 되면 필요없는데 왜 안되냐 발
////			else if(p1Sum>21 && p1Sum<p2sum) {
////				System.out.println("--플레이어 1 승");
////			}else if(p2sum>21 && p2sum<p1Sum) {
////				System.out.println("--플레이어 2 승");
////			}
//
//			
//			else if(p1Sum==p2sum) {
//				System.out.println("무승부");
//			}
//			else {
//				System.out.println("왜안되는거짛히힣히히");
//			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//		for(int x=0;x<12;x++) {
//	 		p1Deck[p1DeckIndex]=deck[deckIndex];
//	 		p1DeckIndex++;
//	 		deckIndex++;
//	 		System.out.println("p1 : "+Arrays.toString(p1Deck));
//	 		
//	 		p2Deck[p2DeckIndex]=deck[deckIndex];
//	 		p2DeckIndex++;
//	 		deckIndex++;
//	 		System.out.println("p2 : "+Arrays.toString(p2Deck));
//	 		}
//		
//		}
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
