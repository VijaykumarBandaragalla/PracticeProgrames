package com.workexp;

import java.util.Scanner;

public class ArayOccurance {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no.of elements to be inserted");
		int size = sc.nextInt();
		int[] a=new int[size]; 
		System.out.println("enter " +size + "elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array elements are");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+"is present in index posisition " + i);
		}
		
		
		System.out.println("enter element to be searched");
		int element=sc.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) {	
			if(element == a[i]) {
				count++;
			}
			
		} 
		System.out.println("no of occurance of  " +element +" is " + count);
		sc.close();
	}

}
