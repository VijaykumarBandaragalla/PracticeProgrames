package com.girmiti.poc;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountExample {
    
    public static Map<Character, Integer> countCharacters(String str) {
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
        return charCount;
    }
    
    public static void main(String[] args) {
        String str = "vijaykumar@123";
        Map<Character, Integer> charCount = countCharacters(str);
        System.out.println("Character count for \"" + str + "\":");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
