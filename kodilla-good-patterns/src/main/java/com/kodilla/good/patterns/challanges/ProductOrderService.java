package com.kodilla.good.patterns.challanges;

public class ProductOrderService implements OrderService {

    public boolean order(final User user, double price){
        System.out.println("Ordering product for: " + user.getName() + " for: " + price);

        return true;
    }
}
