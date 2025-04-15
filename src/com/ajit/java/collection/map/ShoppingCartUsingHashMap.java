package com.ajit.java.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCartUsingHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> cart = new HashMap<>();

        HashMap<String, Double> priceList = new HashMap<>();

        // Predefined Prices
        priceList.put("Apple", 30.0);     // 30 per unit
        priceList.put("Milk", 50.0);
        priceList.put("Bread", 40.0);
        priceList.put("Chocolate", 25.0);
        while (true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Products:");
                    for (Map.Entry<String, Double> entry : priceList.entrySet()) {
                        System.out.println(entry.getKey() + " - ₹" + entry.getValue());
                    }

                    System.out.print("Enter product name to add : ");
                    String product = scanner.nextLine();
                    if (!priceList.containsKey(product)) {
                        System.out.println("Sorry, product not available.");
                        break;
                    }

                    System.out.print("Enter Quantity : ");
                    int quantity = scanner.nextInt();
                    // if product already exists, add quantity
                    cart.put(product, cart.getOrDefault(product, 0) + quantity);
                    System.out.println(quantity + " " + product + "(s) added to cart.");
                    break;

                case 2:
                    System.out.print("Enter product name to remove : ");
                    String removeProduct = scanner.nextLine();
                    if (cart.containsKey(removeProduct)) {
                        cart.remove(removeProduct);
                        System.out.println(removeProduct + " removed from cart");
                    } else {
                        System.out.println("Product not found in the cart");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Your cart ---");
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty");
                    } else {
                        double total = 0;
                        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
                            String prod = entry.getKey();
                            int qty = entry.getValue();
                            double price = priceList.get(prod);
                            double subTotal = price * qty;
                            total += subTotal;
                            System.out.println(prod + " - Qty: " + qty + " - Price: ₹" + price + " - Subtotal: ₹" + subTotal);
                        }
                        System.out.println("Total Bill: ₹" + total);
                    }
                    break;

                case 4:
                    System.out.println("\n--- Checkout ---");
                    if (cart.isEmpty()) {
                        System.out.println("Cart is empty! Add some items first.");
                    } else {
                        double grandTotal = 0;
                        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
                            String prod = entry.getKey();
                            int qty = entry.getValue();
                            double price = priceList.get(prod);
                            double subTotal = price * qty;
                            grandTotal += subTotal;
                        }
                        System.out.println("Your Total Bill Amount is: ₹" + grandTotal);
                        System.out.println("Thank you for shopping with us! 🛒💖");
                        cart.clear(); // Empty the cart after checkout
                    }
                    break;

                case 5:
                    System.out.println("Thank you for shopping 🛒! Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, Try again");
            }
        }
    }
}
