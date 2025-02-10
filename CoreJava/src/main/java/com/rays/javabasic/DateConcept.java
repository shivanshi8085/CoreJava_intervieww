package com.rays.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class DateConcept {
	public static void main(String[] args) {
		
		LocalDate birthday= LocalDate.of(2000, 8,30);
		LocalDate today = LocalDate.now();
		Period p= Period.between(birthday, today);
		System.out.printf("Age is %d Years %d Months %d Days ",p.getYears(),p.getMonths(),p.getDays());
	}

}
