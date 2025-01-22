package com.wiprotraining;

public class staticandnonstatic {

    // Static variable (shared across all instances)
    static int staticCounter = 0;

    // Non-static variable (specific to each object)
    int nonStaticCounter = 0;

    // Constructor to increment counters
    public staticandnonstatic() {
        staticCounter++;  // Increment static counter
        nonStaticCounter++;  // Increment non-static counter
    }

    public void displayCounters() {
        System.out.println("Static Counter: " + staticCounter);
        System.out.println("Non-Static Counter: " + nonStaticCounter);
    }

    public static void main(String[] args) {
        // Creating first object
        staticandnonstatic obj1 = new staticandnonstatic();
        System.out.println("After creating obj1:");
        obj1.displayCounters();

        // Creating second object
        staticandnonstatic obj2 = new staticandnonstatic();
        System.out.println("After creating obj2:");
        obj2.displayCounters();

        // Accessing static variable directly using the class name
        System.out.println("Accessing staticCounter directly: " + staticandnonstatic.staticCounter);
    }
}
