package com.example.javafxdemo;

public class AN2_Product {
    String name;
    double price;
    int quantity;

    public AN2_Product() {
        name = "";
        price = 0;
        quantity = 0;
    }

    public AN2_Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
//    Getters and setters are very important for table view
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
