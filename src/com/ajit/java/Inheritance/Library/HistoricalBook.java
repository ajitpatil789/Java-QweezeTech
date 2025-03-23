package com.ajit.java.Inheritance.Library;

public class HistoricalBook extends Book {
    int publicationYear;

    public HistoricalBook(String title, String author, double price, int publicationYear) {
        super(title, author, price);
        this.publicationYear = publicationYear;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Publication Year : " + publicationYear);
    }
}
