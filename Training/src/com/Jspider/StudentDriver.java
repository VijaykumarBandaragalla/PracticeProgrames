package com.Jspider;

public class StudentDriver {

	public static void main(String[] args) {
		Student s= new Student();
		s.setSid(-23);
		s.setSid(23);
		s.setSname("vikaram");
		System.out.println(s.getSid());
		System.out.println(s.getSname());
	}

}
