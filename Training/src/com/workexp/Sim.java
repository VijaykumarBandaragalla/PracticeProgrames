package com.workexp;

public class Sim {
	private long Simno;
	private String Serviceprovider;
	private double bal;
	
	public Sim(long simno,String Serviceprovider,double bal) {
		this.Simno=simno;
		this.Serviceprovider=Serviceprovider;
		this.bal=bal;
	}
	public long getSimno() {
		return this.Simno;
	}
	public void setSimno(long simno) {
		this.Simno = simno;
	}
	public String getServiceprovider() {
		return this.Serviceprovider;
	}
	public void setServiceprovider(String serviceprovider) {
		this.Serviceprovider = serviceprovider;
	}
	public double getBal() {
		return this.bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	

}
