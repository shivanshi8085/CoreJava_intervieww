package com.rays.javabasic;

import java.time.LocalDate;
import java.time.LocalTime;

public class CurrentTime {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int dd =date.getDayOfMonth();
		int mm= date.getMonthValue();
		int yyyy=date.getYear();
		
		System.out.println(dd+ "/"+mm +"/"+yyyy);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int h = time.getHour();
		int m =time.getMinute();
		int s =time.getSecond();
		
		System.out.println(h+ ":"+m +":"+s);
		
	}

}

///java. time package