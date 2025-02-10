package com.rays.oop;

public class ConstructorOverloading {

	// Constructor overloading ka matlab hai ki ek hi class mein multiple
	// constructors
	// ho sakte hain, lekin unka parameter list alag hoga.

	public ConstructorOverloading() {
		System.out.println("Default Constructor");

	}

	public ConstructorOverloading(String name) {
		System.out.println(name);
	}

	public ConstructorOverloading(String name, String name1) {
		System.out.println(name + " " + name1);
	}

	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
		ConstructorOverloading c1 = new ConstructorOverloading("Shivanshi");
		ConstructorOverloading c2 = new ConstructorOverloading("Shivanshi", "Gupta");
	}

}
