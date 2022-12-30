package com.ggr3ml1n.classes.task7;

import java.util.ArrayList;
import java.util.Arrays;

public class CommodityExpert {
    private final String login;
    private final String password;
    private ArrayList<Product> products;

    private ArrayList<Client> blackList;

    public CommodityExpert(String login, String password, ArrayList<Client> blackList) {
        this.login = login;
        this.password = password;
        this.blackList = blackList;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setEmptyListOfProducts() {
        products = new ArrayList<>();
    }

    public void addProducts(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Client> getBlackList() {
        return blackList;
    }

    public void addToBlackList(Client client) {
        blackList.add(client);
    }

    public void makeSale(Order order, int id, Client client) {
        if (blackList.contains(client)) throw new IllegalArgumentException("Клиент в бан листе");
        Sale sale = new Sale(id, order);
        if (sale.getOrder().getTotalPrice() > client.getBalance()) {
            System.out.println("Вы неспособны оплатить товар - лети в бан-лист");
            addToBlackList(client);
        }
        else {
            System.out.println("Оплата успешна");
        }
    }
}
