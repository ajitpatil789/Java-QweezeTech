package com.ajit.test.oopsPractice.ECommerceSystem;

import com.ajit.test.oopsPractice.CompositionvsInheritance.Car;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Samsung", 25000.00);
        Product p2 = new Product(2, "OnePlus", 20000.00);
        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.checkOut();
    }
}
