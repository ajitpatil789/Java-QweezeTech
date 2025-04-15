package com.ajit.java.File_Handling.PracticeFH;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File is created " + file.getName());
            } else {
                System.out.println("file not created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
