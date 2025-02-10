package com.rays.exception;

public class CheckedException {
	public static void main(String[] args) throws Exception{

		dad();

	}

	private static void dad()throws Exception {

		mom();		
	}

	private static void mom() throws Exception {

		son();

	}

	private static void son() throws Exception {

		throw new  Exception("Mistake....");

	}


}
