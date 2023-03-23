package com.Jspider;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("vijay");
		int i = e.getId();
		String s= e.getName();
		System.out.println(i);
		System.out.println(s);
		
	}
}
