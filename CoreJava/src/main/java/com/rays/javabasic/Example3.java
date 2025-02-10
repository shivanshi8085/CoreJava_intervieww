package com.rays.javabasic;

import java.util.Calendar;

public class Example3 {
	
	public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Object created using factory method: " + calendar.getTime());
    }

}
