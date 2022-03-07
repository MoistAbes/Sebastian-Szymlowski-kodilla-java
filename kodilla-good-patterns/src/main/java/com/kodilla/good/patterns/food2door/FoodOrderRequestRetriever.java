package com.kodilla.good.patterns.food2door;

public class FoodOrderRequestRetriever {
    public FoodOrderRequest retrieve(){
        Supplier supplier = new Supplier("BCB","Most reliable supplier you can find!");
        int productQuantity = 3;
        String productType = "Beef with potatoes and salad";

        return new FoodOrderRequest(supplier, productQuantity, productType);
    }
}
