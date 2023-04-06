package com.work.poc;

import java.util.HashMap;
import java.util.Map;

public class Charactercount {
    
    public static void countCharacters(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount.containsKey(c)) {
                int count = charCount.get(c);
                charCount.put(c, count + 1);
            }
            else {
                charCount.put(c, 1);
            }
        }
        System.out.println("Character count for \"" + str + "\":using map");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        String str = "Vijaykumar@123";
        countCharacters(str);
    }
}
