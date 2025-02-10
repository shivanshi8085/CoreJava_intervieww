package com.rays.string;

public class EqualsMethodAndEqualsOperator {
	public static void main(String[] args) {

		String s1 = "Shivanshi";
		String s2 = "Shivanshi";
		String s3 = "Gupta";
		String s4 = new String("Shivanshi");
		String s5 = new String("Shivanshi");
		String s6 = new String("Gupta");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s1 == s6);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s6));

	}

}
