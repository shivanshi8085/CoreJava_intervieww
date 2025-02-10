package com.rays.string;

public class Palindrom {
	
	public static void main(String[] args) {
		
		String name ="rotoeor";
		boolean flag = true;
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==name.charAt(name.length()-1-i)) {
				
				flag=true;
			}else {
				flag=false;
			}
		}
		System.out.println("palindrom :" + flag);
	}

}
