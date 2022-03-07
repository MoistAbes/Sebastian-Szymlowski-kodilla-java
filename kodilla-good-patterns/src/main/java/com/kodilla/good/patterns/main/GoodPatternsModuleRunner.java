package com.kodilla.good.patterns.main;

import com.kodilla.good.patterns.challanges.*;
import com.kodilla.good.patterns.food2door.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GoodPatternsModuleRunner {
    public static void main(String[] args) {

        //Challange 13.1
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> moviesTitlesMap = movieStore.getMovies();

        moviesTitlesMap.entrySet().stream()
                .flatMap(title -> title.getValue().stream())
                .map(entry -> entry + " ! ")
                .forEach(System.out::print);

        //Challange 13.2
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);

        System.out.println("");

        //Challange 13.4 Food2Door
        FoodOrderRequestRetriever foodOrderRequestRetriever = new FoodOrderRequestRetriever();
        FoodOrderRequest foodOrderRequest = foodOrderRequestRetriever.retrieve();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(new FoodProductOrderService(), new FoodProductOrderRepository());
        extraFoodShop.process(foodOrderRequest);

        HealthyShop healthyShop = new HealthyShop(new FoodProductOrderService(), new FoodProductOrderRepository());
        healthyShop.process(foodOrderRequest);

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(new FoodProductOrderService(), new FoodProductOrderRepository());
        glutenFreeShop.process(foodOrderRequest);


    }
}
