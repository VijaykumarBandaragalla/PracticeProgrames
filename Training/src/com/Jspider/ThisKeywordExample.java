package com.Jspider;

public class ThisKeywordExample {
	String title;
	double Price;
	public void Initialise(String title, double price) {
		this.title=title;
		this.Price=price;
	}
	public void Details() {
		System.out.println(title);
		System.out.println(Price);
	}

	public static void main(String[] args) {
		ThisKeywordExample th = new ThisKeywordExample();
		th.Initialise("vijay ", 123.7436);
		th.Details();
		ThisKeywordExample th2 = new ThisKeywordExample();
		th2.Initialise("ajay", 1265.87656);
		th2.Details();
		
	}

}
