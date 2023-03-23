package com.girmiti.poc;

import java.util.HashMap;

public class FirstNonRepeatedCharExample {
    
    public static char firstNonRepeatedChar(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freqMap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }
    
    public static void main(String[] args) {
        String str = "abbcddfe";
        char firstNonRepeatedChar = firstNonRepeatedChar(str);
        if (firstNonRepeatedChar != '\0') {
            System.out.println("The first non-repeated character in \"" + str + "\" is \"" + firstNonRepeatedChar + "\"");
        } else {
            System.out.println("There are no non-repeated characters in \"" + str + "\"");
        }
    }
}
