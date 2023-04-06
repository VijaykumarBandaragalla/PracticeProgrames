package com.workexp;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample {
	public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("orange");
	al.add("apple");
	al.add("mango");
	al.add("banaanan");
	ListIterator<String> li=al.listIterator();
	while(li.hasNext()){
		System.out.println(li.next());
	}
	al.remove(2);
	ListIterator<String> li1= al.listIterator();
	while(li1.hasNext()) {
		System.out.println(li1.next());
	}
	
	}

}

