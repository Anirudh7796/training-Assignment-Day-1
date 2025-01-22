package com.wiprotraining;

public class finalvariable {
	 final int instanceFinalVariable;

	    // Static final variable (constant)
	    static final double PI = 3.14159;

	    // Constructor to initialize final instance variable
	    public finalvariable(int value) {
	        instanceFinalVariable = value;
	    }

	    public void demonstrateFinalVariable() {
	        // Local final variable
	        final int localFinalVariable = 100;
	        System.out.println("Local Final Variable: " + localFinalVariable);

	        // Uncommenting the line below will cause a compilation error
	        // localFinalVariable = 200;

	        System.out.println("Instance Final Variable: " + instanceFinalVariable);
	    }

	    public static void main(String[] args) {
	        // Create an object and initialize the final instance variable
	        finalvariable demo = new finalvariable(42);

	        // Call the method to demonstrate final variables
	        demo.demonstrateFinalVariable();

	        // Access the static final variable
	        System.out.println("Static Final Variable (PI): " + finalvariable.PI);

	        // Uncommenting the line below will cause a compilation error
	        // finalvariable.PI = 3.14;
	    }
	}