package com.ajit.test.oopsPractice.ECommerceSystem;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
        System.out.println(p.name + " Added to cart");
    }

    void checkOut() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        System.out.println("Total amount : " + total);
    }
}
