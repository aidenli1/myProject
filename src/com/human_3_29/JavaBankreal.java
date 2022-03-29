package com.human_3_29;

public class JavaBankreal {

	//100의 id,pw,account가 필요하여 배열 사용
	public static String id[] =new String[100];
	public static String pw[] =new String[100];
	public static double account[]=new double[100];
	
	//사용자 입력시 사용하는 변수들
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static String inputId = null;
	public static String inputPw = null;
	public static double intputAccount = 0;
	
	//운영시 필요한 변수들
	
	public static int totalUserCount = 0; //전체 가입 유저 데이터수
	
	//로그인 관련 변수들
	//final은 해당 변수가 변경 불가능한 상수를 의미한다.
	
	public static final int LOGIN_LOG_OFF=0; //로그오프 상태
	public static final int LOGIN_NORMAL_USER=1; //일반 사용자 로그인
	public static final int LOGIN_ADMIN_USER=2; //관리자 로그인
	
	//현재 로그인 상태 저장
	//처음에는 로그 오프 상태이므로 login_log_off값을 가짐
	public static int loginState = JavaBankreal.LOGIN_LOG_OFF;
	public static int loginIndex = -1;
	
	public static String adminId = "admin";
	public static String adminPw = "1111";

	//은행 초기데이터 3명 계좌정보입력
	// id, pw , account
	
	public static void init() {
		id[0] = "user1"; 
		pw[0] = "user1";
		account[0]=1000; 
		
		id[1]="user2"; 
		pw[1]="user2";
		account[1]=20000; 
		
		id[2]="user3";
		pw[2]="user3";
		account[2]=4000;
		
		totalUserCount=3;
	}
	//사용자나 관리자로 로그인 할때까지 반복
	
	public static void login() { 
		while(loginState==JavaBankreal.LOGIN_LOG_OFF) {
			System.out.println("ID와 PW를 입력하세요.");
			System.out.println("id>>>>");
			inputId=sc.nextLine();
			System.out.println("pw>>>>");
			inputPw=sc.nextLine();
			
			//일반 사용자 로그인
			
			boolean isFindId = false;
			
			for(int i=0; i<totalUserCount;i++) {
				if(id[i].equals(inputId)) {
					if(pw[i].equals(inputPw)) {
						System.out.println(id[i]+"님 로그인 하셨습니다.");
						loginState = JavaBankreal.LOGIN_NORMAL_USER;
						loginIndex =i;
					}else {
						System.out.println("잘못된 패스워드를 입력하였습니다.");
					}
					isFindId=true;
					break;
				}
			}
			
			if(!isFindId) {
				if(adminId.equals(inputId) && adminPw.equals(inputPw)) {
					System.out.println("관리자로 로그인 하였습니다.");
					loginState = JavaBankreal.LOGIN_ADMIN_USER;
				}else {
					System.out.println(inputId+"는 존재하지 않습니다.");
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
login();
		
	}

}
