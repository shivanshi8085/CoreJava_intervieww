package com.rays.javabasic;

public class Divisiblety {
	public static void main(String[] args) {
		
		
		int a=7;
		int count=0;
		int b=0;
		
		for(int i=100; i<200; i++) {
			
			//for(int i=10; i<100; i++) { (735)
			if(i%a==0) {
				count=i;
				
				System.out.println(count);
				b= b+count;
			}
		}
		//System.out.println("sum"+b);
		
		
	}

}
