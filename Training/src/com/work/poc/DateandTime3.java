package com.work.poc;

import java.time.LocalDate;
import java.time.Period;

public class DateandTime3 {
	public static void main(String[] args) {
		
	
	LocalDate birth = LocalDate.of(1997,11, 01);  //birth date
	LocalDate today = LocalDate.now();   
	//now to know the period between the birth day and today itself is our age
	
	Period p = Period.between(today, birth);
	
	int y = p.getYears();
	int m = p.getMonths();
	int d = p.getDays();
    System.out.println(" years " +y +" months " +m+"  days " +d);
}
}
