package com.ggr3ml1n.classes.task7;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private ArrayList<Product> products = new ArrayList<>();
    private double totalPrice = 0;

    public Order(List<Product> products) {
        setProducts(products);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products.addAll(products);
        setTotalPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    private void setTotalPrice() {
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }
}