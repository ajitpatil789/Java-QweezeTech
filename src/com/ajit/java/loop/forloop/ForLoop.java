package com.ajit.java.loop.forloop;

public class ForLoop {
    public static void main(String[] args) {
        // For Loop
        // Use for loop when you want to repeat block of code multiple times
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Hello");
//        }
        // Loop and Arrays
        String[] names = {
                "James",
                "Nadia",
                "Spphia",
                "Alex"
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // Enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
