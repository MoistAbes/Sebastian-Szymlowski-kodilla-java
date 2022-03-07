package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Producer {

    private FoodOrderService foodOrderService;
    private FoodOrderRepository foodOrderRepository;

    public ExtraFoodShop(FoodOrderService foodOrderService, FoodOrderRepository foodOrderRepository) {
        this.foodOrderService = foodOrderService;
        this.foodOrderRepository = foodOrderRepository;
    }

    @Override
    public boolean process(FoodOrderRequest foodOrderRequest) {
        boolean isOrdered = foodOrderService.order(foodOrderRequest.getSupplier(),foodOrderRequest.getProductQuantity(),foodOrderRequest.getProductType());
        if (isOrdered){
            foodOrderRepository.createOrder(foodOrderRequest.getSupplier(), foodOrderRequest.getProductQuantity(), foodOrderRequest.getProductType());
            System.out.println("Thank you for ordering from Extra Food Shop");
            return true;
        }else {
            return false;
        }
    }
}
