package com.ajit.java.Inheritance.Library;

public class Main {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Java EBook", "Stanley B", 199, 1024);
        HistoricalBook historicalBook = new HistoricalBook("The Art of war", "R R MJ", 599, 1925);
        System.out.println("📗 EBook Details:");
        ebook.show();
        System.out.println("\n📙 Historical Book Details:");
        historicalBook.show();
    }
}
