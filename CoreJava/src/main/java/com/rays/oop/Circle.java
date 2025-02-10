package com.rays.oop;

public class Circle extends Cube {

	@Override
	public void area() {
		System.out.println("this is area");
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.area();

	}
}
