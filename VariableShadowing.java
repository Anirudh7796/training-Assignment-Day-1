package com.wiprotraining;

public class VariableShadowing {

    // Class-level variable
    int x = 10;

    // Method to demonstrate shadowing at method level
    public void shadowMethod(int x) {
        // Method-level shadowing
        System.out.println("Method-level shadowing: x = " + x);
    }

    public void shadowBlock() {
        // Block-level shadowing
        int x = 20;  // This x shadows the class-level x within the method
        if (true) {
            int y = 30;  // Use a different variable name to avoid conflict
            System.out.println("Block-level shadowing (inside if): y = " + y);
        }
        System.out.println("Block-level shadowing (outside if): x = " + x);
    }

    public static void main(String[] args) {
        VariableShadowing obj = new VariableShadowing();

        // Accessing class-level variable
        System.out.println("Class-level x: " + obj.x);

        // Demonstrating method-level shadowing
        obj.shadowMethod(50);  // Here, the parameter 'x' shadows the instance variable 'x'

        // Demonstrating block-level shadowing
        obj.shadowBlock();  // Here, block-level variables shadow class-level and method-level variables
    }
}
