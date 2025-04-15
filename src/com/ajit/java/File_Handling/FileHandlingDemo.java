package com.ajit.java.File_Handling;

import java.io.File;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file = new File("E:\\Java 2025\\GT\\Java GT\\src\\com\\ajit\\java\\File_Handling\\file.txt");
        if (file.exists()) {
            System.out.println("File is present");
            System.out.println("File Name: " + file.getName());
            System.out.println("Location: " + file.getAbsolutePath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.canExecute());
            System.out.println(file.length());
        }

    }
}
