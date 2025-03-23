package com.ajit.java.Inheritance.Library;

public class Ebook extends Book {
    private int bookPages;

    public Ebook(String title, String author, double price, int size) {
        super(title, author, price);
        this.bookPages = size;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Total Pages: " + bookPages);
    }
}
