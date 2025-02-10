package com.rays.string;

public class StringMethod {
	public static void main(String[] args) {

		String name = "Shivanshi";
		String str = "Gupta";

		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf("n"));
		System.out.println(name.indexOf("T"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.replace("v", "k"));
		System.out.println(name.concat(str));
		System.out.println(str.trim());
	}

}
