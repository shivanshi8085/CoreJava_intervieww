package com.rays.javabasic;

public class Example1 implements Cloneable {
	
	public void display() {
        System.out.println("Object created using clone()");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Example1 original = new Example1();
            Example1 clone = (Example1) original.clone();
            clone.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
