package com.rays.oop;

public class ShellowCloning implements Cloneable  {

	public int balance;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ek shallow copy banana is class ke object ka, jab  clone() method call
		// kiya jaayega.

		return super.clone();
	}

}
