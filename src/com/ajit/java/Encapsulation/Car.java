package com.ajit.java.Encapsulation;

public class Car {
    private String brandName;
    private String model;
    private double price;

    public Car(String brandName, String model) {
        this.brandName = brandName;
        this.model = model;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

   
}
