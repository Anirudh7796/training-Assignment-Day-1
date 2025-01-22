package com.wiprotraining;

public class writtentype {

	public String printmessage(String name) {  // signature type is string
        return "Hello, " + name + "!";
    }
	
	public static void main(String[] args) {
        writtentype obj = new  writtentype();
        
        String message = obj.printmessage("Anirudh"); // Stores the returned value
        System.out.println(message);
   }
}
// above code is for non return type