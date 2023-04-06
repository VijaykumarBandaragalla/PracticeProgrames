package com.work.poc;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateandTime5 {
	public static void main(String[] args) {
		ZoneId zi = ZoneId.systemDefault();
		System.out.println(zi);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);
	}

}
