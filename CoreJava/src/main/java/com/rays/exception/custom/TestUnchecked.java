package com.rays.exception.custom;

public class TestUnchecked {
	
	public static void main(String[] args) {
		try {
			dad();
		} catch (UncheckedException e) {
			System.out.println(e);
		}
	}

	public static void dad() {

		mom();

	}

	public static void mom() {

		son();

	}

	public static void son() {

		UncheckedException e = new UncheckedException();

		throw e;

	}


}
