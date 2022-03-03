package com.kodilla.good.patterns.challanges;

public interface OrderRepository {
    boolean createOrder(User user, double price);
}
