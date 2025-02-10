package com.rays.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class DateAgeCalculate {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();

		LocalDate empBirth = LocalDate.of(2000, 8 , 30);

		Period p = Period.between(empBirth, today);

		System.out.println("employe age : " + p.getYears());
	}

}
