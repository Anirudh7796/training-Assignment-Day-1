package com.wiprotraining;

public class VariableTypesDemo {

    // Instance variable
    int instanceVar;

    // Static variable
    static int staticVar;

    public void demonstrateVariables() {
        // Local variable
        int localVar = 10;

        // Accessing local, instance, and static variables
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Creating objects of the class
        VariableTypesDemo obj1 = new VariableTypesDemo();
        VariableTypesDemo obj2 = new VariableTypesDemo();

        // Modifying instance variable for obj1 and obj2
        obj1.instanceVar = 5;
        obj2.instanceVar = 15;

        // Modifying static variable
        VariableTypesDemo.staticVar = 20;

        // Displaying values for obj1
        System.out.println("Object 1:");
        obj1.demonstrateVariables();

        // Displaying values for obj2
        System.out.println("Object 2:");
        obj2.demonstrateVariables();
    }
}