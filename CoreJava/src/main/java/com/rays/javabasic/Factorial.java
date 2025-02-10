package com.rays.javabasic;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		int number = 4;

		for (int i = 1; i <= 4; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
