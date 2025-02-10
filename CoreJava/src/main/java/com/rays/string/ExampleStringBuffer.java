package com.rays.string;

public class ExampleStringBuffer {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Shivanshi");
		//sb.append("Gupta");
		
		System.out.println(sb.append("Gupta"));
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
	}

}
