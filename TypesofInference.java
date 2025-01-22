package com.wiprotraining;

public class TypesofInference {

    public static void main(String[] args) {
        
        // Using var for different types of variables
        var integerVar = 10;                // Inferred as int
        var stringVar = "Hello, Anirudh!";  // Inferred as String
        var doubleVar = 3.14;               // Inferred as double
        var booleanVar = true;              // Inferred as boolean

        // Printing the inferred types and values
        System.out.println("Integer Variable: " + integerVar);
        System.out.println("String Variable: " + stringVar);
        System.out.println("Double Variable: " + doubleVar);
        System.out.println("Boolean Variable: " + booleanVar);

        // Using var in a loop
        for (var i = 0; i < 5; i++) {
            System.out.println("Loop variable i: " + i);
        }

        // Using var with complex types
        var list = java.util.List.of(1, 2, 3, 4, 5);  // Inferred as List<Integer>
        System.out.println("List: " + list);
    }
}
