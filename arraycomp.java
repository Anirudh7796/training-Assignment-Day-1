package com.wiprotrain2;

import java.util.Scanner;

public class arraycomp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the arrays:");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];

        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.println("Comparison results:");
        for (int i = 0; i < size; i++) {
            String result = (array1[i] == array2[i]) ? "equal"
                           : (array1[i] > array2[i]) ? "greater"
                           : "lesser";
            System.out.println("Element " + (i + 1) + ": First array is " + result + " than the second array.");
        }
    }
}
