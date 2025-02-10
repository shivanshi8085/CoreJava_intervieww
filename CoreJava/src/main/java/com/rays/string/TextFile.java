package com.rays.string;

public class TextFile {
	public static void main(String[] args) {
		
		
		String[] arr = {"hello.txt", "hindi.txt","abc.python", "hello.java"};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].endsWith(".txt")) {
				System.out.println(arr[i]);
			}
			
		}

	}

}
