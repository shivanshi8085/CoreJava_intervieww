package com.rays.string;

public class AtoZ {
	public static void main(String[] args) {
		
		String name="Shivanshi";
		
		for(char i='a'; i<='z'; i++) {
			if(name.indexOf(i)== -1) {
				
				System.out.println(i);
			}
		}
	}

}
