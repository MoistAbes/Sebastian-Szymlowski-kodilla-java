package com.kodilla.good.patterns.food2door;

public class FoodProductOrderRepository implements FoodOrderRepository {
    @Override
    public boolean createOrder(Supplier supplier, int productQuantity, String productType) {
        return true;
    }
}
