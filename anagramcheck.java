package com.wiprotrain2;
import java.util.Arrays;

public class anagramcheck {
    public static void main(String[] args) {
        // Input strings
        String str1 = "Listen";
        String str2 = "Silent";

        // Check if the strings are anagrams
        boolean result = areAnagrams(str1, str2);

        // Print the result
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + (result ? "Yes" : "No"));
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Convert strings to lowercase to ignore case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false; // Not anagrams if lengths differ
        }

        // Create an array to count character occurrences (for a-z, 26 characters)
        int[] charCount = new int[26];

        // Count characters in the first string
        for (char ch : str1.toCharArray()) {
            if (Character.isLetter(ch)) {
                charCount[ch - 'a']++; // Increment count for the character
            }
        }

        // Subtract character counts using the second string
        for (char ch : str2.toCharArray()) {
            if (Character.isLetter(ch)) {
                charCount[ch - 'a']--; // Decrement count for the character
            }
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false; // Not anagrams if any count is non-zero
            }
        }

        return true; // Strings are anagrams
    }
}
