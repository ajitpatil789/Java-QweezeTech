package com.ajit.java.File_Handling.ByAjit.File_Based_Notes_App;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class NotesApp {
    private static final String NOTES_DIR = "notes";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ensure the notes directory exists
        File directory = new File(NOTES_DIR);
        if (!directory.exists()) {
            directory.mkdir();
        }
        while (true) {
            System.out.println("\n📌 Notes Application");
            System.out.println("1. Create a Note");
            System.out.println("2. View Notes");
            System.out.println("3. Delete a Note");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> createNote(scanner);
                case 2 -> viewNotes();
                case 3 -> deleteNote(scanner);
                case 4 -> {
                    System.out.println("📂 Exiting Notes App...");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("❌ Invalid option! Try again.");
            }
        }
    }

    // Create a new note
    private static void createNote(Scanner scanner) {
        System.out.print("Enter note title: ");
        String title = scanner.nextLine().trim();
        String filePath = NOTES_DIR + "/" + title + ".txt";

        if (Files.exists(Paths.get(filePath))) {
            System.out.println("❌ A note with this title already exists.");
            return;
        }

        System.out.println("Write your note below (Type 'END' on a new line to save):");
        StringBuilder content = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if ("END".equalsIgnoreCase(line)) break;
            content.append(line).append("\n");
        }

        try {
            Files.write(Paths.get(filePath), content.toString().getBytes());
            System.out.println("✅ Note saved successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error saving note.");
            e.printStackTrace();
        }
    }

    // View all notes
    private static void viewNotes() {
        File directory = new File(NOTES_DIR);
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("📭 No notes found.");
            return;
        }

        System.out.println("\n📖 Your Notes:");
        for (int i = 0; i < files.length; i++) {
            System.out.println((i + 1) + ". " + files[i].getName().replace(".txt", ""));
        }

        System.out.print("\nEnter note number to read or 0 to go back: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice > 0 && choice <= files.length) {
            readNote(files[choice - 1]);
        }
    }

    // Read a specific note
    private static void readNote(File file) {
        try {
            System.out.println("\n📝 " + file.getName().replace(".txt", ""));
            System.out.println("----------------------");
            Files.lines(file.toPath()).forEach(System.out::println);
            System.out.println("----------------------\n");
        } catch (IOException e) {
            System.out.println("❌ Error reading note.");
        }
    }

    // Delete a note
    private static void deleteNote(Scanner scanner) {
        File directory = new File(NOTES_DIR);
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("📭 No notes found.");
            return;
        }

        System.out.println("\n🗑️ Select a note to delete:");
        for (int i = 0; i < files.length; i++) {
            System.out.println((i + 1) + ". " + files[i].getName().replace(".txt", ""));
        }

        System.out.print("\nEnter note number to delete or 0 to cancel: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice > 0 && choice <= files.length) {
            if (files[choice - 1].delete()) {
                System.out.println("✅ Note deleted successfully.");
            } else {
                System.out.println("❌ Failed to delete note.");
            }
        }
    }
}
