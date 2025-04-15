package com.ajit.java.File_Handling.ByAjit;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOWriteFile {
    public static void main(String[] args) {
        String content = "This is an example text using NIO.";
        try {
            Files.write(Paths.get("ajit.txt"), content.getBytes(StandardCharsets.UTF_8));
            System.out.println("File written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
