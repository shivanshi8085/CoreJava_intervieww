package com.rays.string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String a = "Shiv";
		String b = "sHIv";

		char [] c = a.toUpperCase().toCharArray();
		char [] d = b.toUpperCase().toCharArray();

		Arrays.sort(c);
		Arrays.sort(d);

		if (Arrays.equals(c, d)) {
			System.out.println(a + " : " + b + " is anagram ");
		} else {
			System.out.println(a + " : " + b + " is not anagram ");
		}
	}

}


