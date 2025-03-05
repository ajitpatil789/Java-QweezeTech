package com.ajit.java.String;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String s = "Java";
        StringBuilder builder = new StringBuilder(s);
        System.out.println(builder.reverse());
    }
}
