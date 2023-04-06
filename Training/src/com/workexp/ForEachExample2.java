package com.workexp;

import java.util.ArrayList;

public class ForEachExample2 {
	String name;
	double price;
	public ForEachExample2(String name, double price) {
		this.name=name;
		this.price=price;
	}
	
	public String toString() {
		return name + " " + price + "";
		
	}
	public static void main(String[] args) {
		ArrayList<ForEachExample2> Dabbba = new ArrayList<ForEachExample2>();
		Dabbba.add(new ForEachExample2("Monkey", 1500));
		Dabbba.add(new ForEachExample2("tiger", 6700));
		for(Object o:Dabbba){
			System.out.println(o);
		}
		
	}
}
