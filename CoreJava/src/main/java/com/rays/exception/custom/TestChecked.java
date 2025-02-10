package com.rays.exception.custom;

public class TestChecked {

	public static void main(String[] args) throws Exception {

		try {
			dad();
		} catch (CheckedException e) {
			System.out.println(e);
		}

	}

	public static void dad() throws CheckedException {

		mom();

	}

	public static void mom() throws CheckedException {

		son();

	}

	public static void son() throws CheckedException {

		CheckedException e = new CheckedException();

		throw e;

	}
}
