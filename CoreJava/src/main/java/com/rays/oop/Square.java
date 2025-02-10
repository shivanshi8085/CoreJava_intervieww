package com.rays.oop;

public class Square extends Shape {

	public void draw() {
		System.out.println("Square shape");
	}

	public static void main(String[] args) {
		Shape s = new Square();

		s.draw();

	}
}
