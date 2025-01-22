package com.wiprotraining;

public class areaofcircle {

    // Defining constants using static final
    static final double PI = 3.14159;

    // Method to calculate area
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    // Method to calculate circumference
    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        // Define the radius of the circle
        double radius = 5.0;

        // Calculate area and circumference using the constants
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);

        // Output the results
        System.out.println("For a circle with radius " + radius + ":");
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
