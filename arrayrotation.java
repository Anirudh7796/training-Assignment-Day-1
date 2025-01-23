package com.wiprotrain2;

import java.util.Scanner;

public class arrayrotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the number of rotations
        System.out.println("Enter the number of rotations:");
        int n = scanner.nextInt();

        // Input the direction of rotation
        System.out.println("Enter the direction of rotation (left or right):");
        String direction = scanner.next().toLowerCase();

        // Perform the rotation
        if (direction.equals("left")) {
            rotateLeft(array, n);
        } else if (direction.equals("right")) {
            rotateRight(array, n);
        } else {
            System.out.println("Invalid direction! Please enter 'left' or 'right'.");
            return;
        }

        // Output the rotated array
        System.out.println("Rotated array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateLeft(int[] array, int n) {
        int length = array.length;
        n = n % length; // Handle rotations greater than array size
        for (int i = 0; i < n; i++) {
            int first = array[0];
            for (int j = 0; j < length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[length - 1] = first;
        }
    }

    public static void rotateRight(int[] array, int n) {
        int length = array.length;
        n = n % length; // Handle rotations greater than array size
        for (int i = 0; i < n; i++) {
            int last = array[length - 1];
            for (int j = length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
    }
}
