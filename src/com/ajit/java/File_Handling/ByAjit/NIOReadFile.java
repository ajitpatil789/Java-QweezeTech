package com.ajit.java.File_Handling.ByAjit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOReadFile {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("ajit.txt")));
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
