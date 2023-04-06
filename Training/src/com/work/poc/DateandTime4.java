package com.work.poc;

import java.time.Year;
import java.util.Scanner;

public class DateandTime4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year number");
		int n = sc.nextInt();
		Year y = Year.of(n);
		
		final boolean is = y.isLeap(n);
		System.out.println(is);
		sc.close();
	}

}