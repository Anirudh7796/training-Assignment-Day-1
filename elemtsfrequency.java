package com.wiprotrain2;

import java.util.Scanner;

public class elemtsfrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Element frequencies:");

        for (int i = 0; i < size; i++) {
            int count = 1;  // Initialize count for each element

            if (array[i] != Integer.MIN_VALUE) {  // To avoid counting the same element again
                for (int j = i + 1; j < size; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        array[j] = Integer.MIN_VALUE;  // Mark as visited
                    }
                }
                System.out.println("Element " + array[i] + " appears " + count + " times.");
            }
        }
    }
}
