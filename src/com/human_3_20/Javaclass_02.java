package com.human_3_20;

public class Javaclass_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
int arr[] = {1,2,3,4,5,6};
		
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		
		for(int i=0;i<arr.length;i++) {
			int a = ((int)(Math.random()*6+1));
			if(a==1) {
				count1= count1++;
				if(a==2) {
					count2= count2++;
					if(a==3) {
						count3= count3++;
						if(a==4) {
							count4= count4++;
							if(a==5) {
								count5= count5++;
								if(a==6) {
									count6= count6++;
				
			}
		}
						}
					}
				}
			}
		}
							System.out.println(count1);
	}

}
