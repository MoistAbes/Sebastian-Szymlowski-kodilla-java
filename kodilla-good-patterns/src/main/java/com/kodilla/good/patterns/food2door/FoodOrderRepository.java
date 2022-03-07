package com.kodilla.good.patterns.food2door;

public interface FoodOrderRepository {
    boolean createOrder(Supplier supplier, int productQuantity, String productType);
}
