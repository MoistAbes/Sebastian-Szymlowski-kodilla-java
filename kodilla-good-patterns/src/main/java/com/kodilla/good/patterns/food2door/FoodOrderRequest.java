package com.kodilla.good.patterns.food2door;

public class FoodOrderRequest {
    private Supplier supplier;
    private int productQuantity;
    private String productType;

    public FoodOrderRequest(Supplier supplier, int productQuantity, String productType) {
        this.supplier = supplier;
        this.productQuantity = productQuantity;
        this.productType = productType;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProductType() {
        return productType;
    }
}
