package com.ajit.java.File_Handling.ByAjit;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        // Writing to a File
        try {
            FileWriter writer = new FileWriter("ajit.txt");
            writer.write("Hello, this is sample text file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
