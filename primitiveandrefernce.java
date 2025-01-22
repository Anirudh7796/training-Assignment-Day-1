package com.wiprotraining;

public class primitiveandrefernce {

    public static void modifyPrimitive(int num) {
        num += 10; // Modifying the local copy
        System.out.println("Inside modifyPrimitive: " + num);
    }

    public static void modifyReference(int[] array) {
        array[0] += 10; // Modifying the object through the reference
        System.out.println("Inside modifyReference: " + array[0]);
    }

    public static void main(String[] args) {
        // Primitive variable
        int primitiveVar = 20;
        System.out.println("Before modifyPrimitive: " + primitiveVar);
        modifyPrimitive(primitiveVar);
        System.out.println("After modifyPrimitive: " + primitiveVar);

        // Reference variable
        int[] referenceVar = {20};
        System.out.println("Before modifyReference: " + referenceVar[0]);
        modifyReference(referenceVar);
        System.out.println("After modifyReference: " + referenceVar[0]);
    }
}
