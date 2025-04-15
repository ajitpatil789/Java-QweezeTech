package com.ajit.java.File_Handling.ByAjit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadFile {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("ajit.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
