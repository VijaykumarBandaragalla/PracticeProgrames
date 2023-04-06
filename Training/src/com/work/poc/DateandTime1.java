package com.work.poc;

import java.time.LocalDateTime;

public class DateandTime1 {
	public static void main(String[] args) {
		LocalDateTime ld = LocalDateTime.now();
		System.out.println(ld);
		
		System.out.println(ld.withDayOfMonth(1).withYear(2019));
	}

}

