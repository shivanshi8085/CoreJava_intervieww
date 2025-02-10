package com.rays.javabasic;

public class ReverseNumber {
	public static void main(String[] args) {
		
		int a= 584;
		int b=0;
		int c=a;
		int d=0;
		
		while(c !=0) {
			
			d =c%10;
			b= b*10+d;
			c= c/10;
		}
		System.out.println(b);
	}

}
