package com.ajit.java.File_Handling.PracticeFH;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("file.txt", true);
            writer.write("\nThis is 2st file");
            writer.close();
            System.out.println("Suceessfully wrote to file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
