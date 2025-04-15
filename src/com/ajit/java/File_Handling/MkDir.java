package com.ajit.java.File_Handling;

import java.io.File;


public class MkDir {
    public static void main(String[] args) {
//        File file = new File("Folder/java");   // folder creation
//        if (file.mkdirs()) {
//            System.out.println("Folder created ");
//        } else {
//
//            System.out.println("problem");
//        }
//        System.out.println(file.getAbsolutePath());

        // file creation inside Folder/java
//        File file = new File("Folder/java/Bootstap.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("file created..");
//            } else {
//                System.out.println("not created");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        // fetch list of files
        File file = new File("Folder/java");
        if (file.exists() && file.isDirectory()) {
            String[] list = file.list();
            if (list != null && list.length > 0) {
                for (String files : list) {
                    System.out.println(files);
                }
            } else {
                System.out.println("Directory is empty");
            }
        } else {
            System.out.println("Directory does not exists");
        }
    }
}

