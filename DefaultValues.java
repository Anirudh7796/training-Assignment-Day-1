package com.wiprotraining;

public class DefaultValues {

    // Instance variables
    int instanceInt;
    float instanceFloat;
    boolean instanceBoolean;
    char instanceChar;
    String instanceString;

    // Static variables
    static int staticInt;
    static double staticDouble;
    static boolean staticBoolean;
    static String staticString;

    public static void main(String[] args) {
        // Create an object to access instance variables
        DefaultValues obj = new DefaultValues();

        // Display default values of instance variables
        System.out.println("Instance Variables:");
        System.out.println("int instanceInt = " + obj.instanceInt);
        System.out.println("float instanceFloat = " + obj.instanceFloat);
        System.out.println("boolean instanceBoolean = " + obj.instanceBoolean);
        System.out.println("char instanceChar = [" + obj.instanceChar + "]");
        System.out.println("String instanceString = " + obj.instanceString);

        // Display default values of static variables
        System.out.println("\nStatic Variables:");
        System.out.println("int staticInt = " + staticInt);
        System.out.println("double staticDouble = " + staticDouble);
        System.out.println("boolean staticBoolean = " + staticBoolean);
        System.out.println("String staticString = " + staticString);
    }
}
