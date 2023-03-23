package com.Jspider;

public class SimDriver {
	public static void main(String[] args) {
		Sim s= new Sim(897130364,"Airtel",69.69);
		System.out.println(s.getBal());
		System.out.println(s.getServiceprovider());
		System.out.println(s.getSimno());
		s.setBal(65.65);
		s.setServiceprovider("jio");
		s.setSimno(938096496);
		System.out.println("sim details updated sucessfully");
		System.out.println("After updataion sim details are");
		System.out.println(s.getBal());
		System.out.println(s.getServiceprovider());
		System.out.println(s.getSimno());
		
	}
}
