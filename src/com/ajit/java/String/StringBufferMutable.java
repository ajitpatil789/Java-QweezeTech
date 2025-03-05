package com.ajit.java.String;

public class StringBufferMutable {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append("World");
        System.out.println(buffer);

        // using String Builder
        StringBuilder builder = new StringBuilder("Java");
        builder.append("Programming");
        System.out.println(builder);
    }
}
