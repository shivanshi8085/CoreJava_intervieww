package com.rays.oop;

public final class Immutable {

	private final int no;

	public Immutable(int no) {
		this.no = no;

	}

	public int value() {
		return no;

	}

	public static void main(String[] args) {
		Immutable ob = new Immutable(10);
		//value() method use karke hum no ki value ko print karte hain

		System.out.println(ob.value());
	}
}
