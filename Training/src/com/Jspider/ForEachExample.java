package com.Jspider;

import java.util.ArrayList;

public class ForEachExample{

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("vijay");
		al.add("vikaram");
		for(Object o:al)
		System.out.println(o);
	}
}
