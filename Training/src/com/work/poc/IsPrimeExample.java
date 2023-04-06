package com.work.poc;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class IsPrimeExample {
    public static void main(String[] args) {
    while(true) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a nuber to check wether number is Prime or not!!..");
    	int num1=sc.nextInt();
        IntPredicate isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(num1 + " is prime? " + isPrime.test(num1));
        System.out.println("========================================");
    }
  }
}

