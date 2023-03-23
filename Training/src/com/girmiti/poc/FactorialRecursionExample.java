package com.girmiti.poc;

public class FactorialRecursionExample {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("The factorial of " + n + " is " + result);
    }
}
