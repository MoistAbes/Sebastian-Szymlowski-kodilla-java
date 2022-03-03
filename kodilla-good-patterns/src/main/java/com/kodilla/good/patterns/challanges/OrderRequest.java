package com.kodilla.good.patterns.challanges;

public class OrderRequest {
    private User user;
    private double price;

    public OrderRequest(User user, double price) {
        this.user = user;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public double getPrice() {
        return price;
    }
}
