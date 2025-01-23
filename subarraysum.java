package com.wiprotrain2;

import java.util.Scanner;

public class subarraysum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int maxSum = findMaxSubarraySum(array);
        System.out.println("The maximum sum of a contiguous subarray is: " + maxSum);
    }

    public static int findMaxSubarraySum(int[] array) {
        int maxSum = array[0];
        int currentSum = array[0];

        for (int i = 1; i < array.length; i++) {
            currentSum = (currentSum + array[i] > array[i]) ? currentSum + array[i] : array[i];
            maxSum = (currentSum > maxSum) ? currentSum : maxSum;
        }

        return maxSum;
    }
}
