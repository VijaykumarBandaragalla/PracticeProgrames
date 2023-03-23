package com.girmiti.poc;

import java.time.LocalDateTime;

public class DateandTime2 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(1997, 11, 1, 9, 45);
		System.out.println(dt);
		//After 6 months what is the date
		System.out.println("After 6 months: " + dt.plusMonths(6));
		
		System.out.println("Before 6 months: " + dt.minusMonths(8));
		
		System.out.println("Add two days: " + dt.plusDays(2));
		
		System.out.println("Add two weeks: " + dt.plusWeeks(2));
		
		System.out.println("Add two weeks: " + dt.plusYears(2));
		
		System.out.println("Day " + dt.getDayOfMonth());
		
		System.out.println("Month " + dt.getMonth());
		
		System.out.println("Year " + dt.getYear());
		
		System.out.println("Hour " + dt.getHour());
	}
}
