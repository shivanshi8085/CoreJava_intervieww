package com.rays.string;

public class VowelCount1 {
	public static void main(String[] args) {

		String name = "Introduction";
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				count++;
			}
			if ("aeiouAEIOU".indexOf(ch) != -1) {
				System.out.println(ch);
			}

		}
		System.out.println(count);
	}

}
