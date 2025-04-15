package com.ajit.java.File_Handling.PracticeFH;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadToFile {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
