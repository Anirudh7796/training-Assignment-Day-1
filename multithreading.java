package com.wiprotraining;

public class multithreading {

    // Volatile variable
    private static volatile boolean flag = false;

    // Thread 1: This thread will keep running until the flag becomes true
    static class Thread1 extends Thread {
        public void run() {
            while (!flag) {
                // Do some work, but keep checking the flag
            }
            System.out.println("Thread 1 finished executing.");
        }
    }

    // Thread 2: This thread will change the value of flag after some time
    static class Thread2 extends Thread {
        public void run() {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true; // Change the flag value
            System.out.println("Thread 2 changed the flag value to true.");
        }
    }

    public static void main(String[] args) {
        // Create and start threads
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
