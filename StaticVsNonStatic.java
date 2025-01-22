package com.wiprotraining;

public class StaticVsNonStatic {

    // Static method
    public static void printStaticMessage(String name) {
        System.out.println("Hello from Static Method, " + name + "!");
    }

    // Non-static method
    public void printNonStaticMessage(String name) {
        System.out.println("Hello from Non-Static Method, " + name + "!");
    }

    public static void main(String[] args) {
        // Calling the static method
        StaticVsNonStatic.printStaticMessage("Anirudh");

        // Creating an object to call the non-static method
        StaticVsNonStatic obj = new StaticVsNonStatic();
        obj.printNonStaticMessage("Anirudh");
    }
}