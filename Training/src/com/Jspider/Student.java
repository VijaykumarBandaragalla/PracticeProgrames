package com.Jspider;

public class Student {
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		if(sid>0) {
			System.out.println("student id is created");
			this.sid = sid;
		}
		else {
			System.out.println("student id cannot be negative");
		}
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
