package com.workexp;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("vijay");
		al.add("ajay");
		al.add("sanjay");
		ListIterator<String> li = al.listIterator(3);
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
		
		
	}

}
