package com.ggr3ml1n.classes.task7;

import java.util.Arrays;

public class Client {
    private Order order;
    private double balance;

    public Client(double balance) {
        setBalance(balance);
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance <0) throw new IllegalArgumentException();
        this.balance = balance;
    }

    public void makeOrder(Product... products){
        order = new Order(Arrays.asList(products));

    }


}
