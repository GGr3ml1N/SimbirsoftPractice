package com.ggr3ml1n.classes.task7;

public class Product {
    private String nameOfProduct;
    private double price;

    public Product(String nameOfProduct, double price) {
        setNameOfProduct(nameOfProduct);
        setPrice(price);
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException();
        this.price = price;
    }
}
