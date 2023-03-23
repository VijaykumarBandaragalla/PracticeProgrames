package com.Jspider;

public class ConstructorOverloadingEx {
	String name;
	long Cno;
	long Acn;
	
	public ConstructorOverloadingEx(String name) {
		this.name=name;
	}
	public ConstructorOverloadingEx(String name,long Cno) {
		this(name);
		this.Cno=Cno;
	}
	public ConstructorOverloadingEx(String name,long Cno,long Acn) {
		this(name,Cno);
		this.Acn=Acn;
	}
	public void Print() {
		System.out.println(name);
		System.out.println(Cno);
		System.out.println(Acn);
	}
	public static void main(String[] args) {
		ConstructorOverloadingEx col1=new ConstructorOverloadingEx("Shella");
		ConstructorOverloadingEx col2=new ConstructorOverloadingEx("leela",765767576);
		ConstructorOverloadingEx col3=new ConstructorOverloadingEx("mala",46537643,73547);
		col1.Print();
		System.out.println("================");
		col2.Print();
		System.out.println("================");
		col3.Print();
	}
}
