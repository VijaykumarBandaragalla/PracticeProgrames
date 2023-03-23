package com.girmiti.poc;

public class StringReverseExample {
    
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "vijaykumar@123";
        String reversedStr = reverse(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
