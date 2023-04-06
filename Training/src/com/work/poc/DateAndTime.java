package com.work.poc;

import java.time.LocalDate;
import java.time.LocalTime;
public class DateAndTime {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		int dd = d.getDayOfMonth();
		int mm = d.getMonthValue();
		int yyyy = d.getYear();
		System.out.println("Date:" + dd + " Month:" + mm + " Year:" + yyyy);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		int h = t.getHour();
		int m = t.getMinute();
		int s = t.getSecond();
		int n = t.getNano();
		System.out.println("Hour:"+ h +" Minute:"+m+" second:"+s+" Nanosecond:"+n);
	}
}