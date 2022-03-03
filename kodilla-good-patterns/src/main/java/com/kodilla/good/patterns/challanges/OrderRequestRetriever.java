package com.kodilla.good.patterns.challanges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Sebastian", "Klaksow");

        double price = 122.99;

        return new OrderRequest(user, price);
    }
}
