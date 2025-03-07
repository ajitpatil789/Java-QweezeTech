package com.ajit.java.stringQweezeTech.StringBuffer;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello Java"); // 16 is the inbuilt capacity.
        System.out.println(buffer.capacity());
        System.out.println(buffer.append(" Programing"));
        
    }
}
