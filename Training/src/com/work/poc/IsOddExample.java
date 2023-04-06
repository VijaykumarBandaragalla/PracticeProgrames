package com.work.poc;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class IsOddExample {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a nuber to check wether number is odd or not!!..");
    	int num1=sc.nextInt();
        IntPredicate isOdd = n -> n % 2 != 0;
        System.out.println(num1 + " is odd? " + isOdd.test(num1));
        sc.close();
    }
}