package com.rays.javabasic;

public class Number {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			boolean temp = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					temp = true;
					break;
				}
			}
			if (!temp) {
				System.out.println(a[i]);
			}
		}

	}
}
