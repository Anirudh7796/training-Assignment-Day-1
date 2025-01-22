package com.wiprotraining;

public class VariableScopeDemo {

    // Instance variable
    int instanceVariable = 50;

    // Static variable
    static int staticVariable = 100;

    public void demonstrateScope() {
        // Local variable
        int localVariable = 10;

        System.out.println("Local Variable (inside method): " + localVariable);

        // Accessing instance and static variables
        System.out.println("Instance Variable (inside method): " + instanceVariable);
        System.out.println("Static Variable (inside method): " + staticVariable);

        // Block variable inside a loop
        for (int i = 0; i < 1; i++) {
            int blockVariable = 20;
            System.out.println("Block Variable (inside loop): " + blockVariable);
        }

        // Block variable is not accessible outside the block
        // Uncommenting the line below will cause a compilation error
        // System.out.println(blockVariable);
    }

    public static void main(String[] args) {
        // Accessing static variable in static context
        System.out.println("Static Variable (inside main): " + staticVariable);

        // Creating an object to access instance variable
        VariableScopeDemo demo = new VariableScopeDemo();
        System.out.println("Instance Variable (inside main): " + demo.instanceVariable);

        // Call the method to demonstrate scope
        demo.demonstrateScope();

        // Local variable in the main method
        int mainLocalVariable = 30;
        System.out.println("Local Variable (inside main): " + mainLocalVariable);
    }
}