package com.kodilla.good.patterns.food2door;

public interface FoodOrderService {
    boolean order(Supplier supplier, int productQuantity, String productType);
}
