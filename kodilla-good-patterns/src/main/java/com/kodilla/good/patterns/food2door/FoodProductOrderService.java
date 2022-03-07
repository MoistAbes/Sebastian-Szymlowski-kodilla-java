package com.kodilla.good.patterns.food2door;

public class FoodProductOrderService implements FoodOrderService {
    @Override
    public boolean order(Supplier supplier, int productQuantity, String productType) {
        System.out.println("Succesfully ordered: " + productQuantity + " " + productType + " it will be delivered by: " + supplier.getName());
        return true;
    }
}
