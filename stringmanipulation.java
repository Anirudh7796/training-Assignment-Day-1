package com.wiprotrain2;

import java.util.HashMap;

public class stringmanipulation {
    public static void main(String[] args) {
        // Input string
        String input = "Hello, World! 123";
        System.out.println("Input String: " + input);

        input = input.toLowerCase();

        // HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through the string
        for (char ch : input.toCharArray()) {
           // Check if the character is a letter or digit
            if (Character.isLetterOrDigit(ch)) {
                // Update the frequency in the map
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequencies:");
        for (HashMap.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
