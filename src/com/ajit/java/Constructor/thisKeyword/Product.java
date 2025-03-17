package com.ajit.java.Constructor.thisKeyword;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void show() {
        System.out.println("Product Name : " + name);
        System.out.println("Product Price :" + price);
    }

//    public static void main(String[] args) {
//        Product product = new Product("OnePlus", 25000);
//        product.show();
////        System.out.println(product);
//    }
}
