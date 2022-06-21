package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Standard pizza (tomato sauce, cheese)", description);
    }

    @Test
    public void testExtraCheeseOrderGetPrice(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testExtraCheeseOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Standard pizza (tomato sauce, cheese) + cheese", description);
    }

    @Test
    public void testExtraCheeseSalamiOrderGetPrice(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testExtraCheeseSalamiOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Standard pizza (tomato sauce, cheese) + cheese + salami", description);
    }

    @Test
    public void testExtraCheeseWithTwoChickenOrderGetPrice(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);

        //When
        BigDecimal cost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(30), cost);
    }

    @Test
    public void testExtraCheeseWithTwoChickenOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Standard pizza (tomato sauce, cheese) + cheese + chicken + chicken", description);
    }
}
