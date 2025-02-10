package com.rays.string;

public class CountAccurenceOfArray {
	public static void main(String[] args) {
		
		String [] n = {"abc","cba"};
		
		for(char a='a'; a<='z'; a++) {
			int count =0;
			for(String s : n) {
				for(int i=0; i<s.length(); i++) {
					if(a==s.charAt(i)) {
						count++;
					}
				}
			}
			if(count > 0) {
				System.out.println( a +" : " + count);
			}
		}
	}

}
