package com.ajit.java.File_Handling.ByAjit;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("E:\\Java 2025\\GT\\Java GT\\src\\com\\ajit\\java\\File_Handling\\file.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
