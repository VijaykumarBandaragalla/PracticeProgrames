package com.work.poc;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class IsPalindromeExample {
    public static void main(String[] args) {
    while(true) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a nuber to check wether number is Palindrome or not!!..");
    	int num1=sc.nextInt();
        IntPredicate isPalindrome = n -> {
            int reversedNum = 0;
            int originalNum = n;
            while (originalNum != 0) {
                int digit = originalNum % 10;
                reversedNum = reversedNum * 10 + digit;
                originalNum /= 10;
            }
            return n == reversedNum;
        };
        System.out.println( num1 + " is a palindrome? " + isPalindrome.test(num1)); 
    }
    }
}

