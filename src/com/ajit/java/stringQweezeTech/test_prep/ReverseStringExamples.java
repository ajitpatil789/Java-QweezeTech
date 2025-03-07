package com.ajit.java.stringQweezeTech.test_prep;

public class ReverseStringExamples {

    public static void main(String[] args) {
        String str = "Hello";

        // Using String (without built-in methods)
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        System.out.println("Reversed String : " + reverseString);

        // Using StringBuffer
        StringBuffer buffer = new StringBuffer(str);
        System.out.println("Reverse String using String Buffer: " + buffer.reverse());

        // Using StringBuilder
        StringBuilder builder = new StringBuilder(str);
        System.out.println("Reverse String using String Buffer: " + builder.reverse());
    }
}
