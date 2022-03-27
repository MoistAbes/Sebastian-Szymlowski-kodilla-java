package com.kodilla.kodillaspring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//14.2

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){
        //Given

        //When
        double addResult = calculator.add(3,3);
        double subResult = calculator.sub(3,3);
        double mulResult = calculator.mul(3,3);
        double divResult = calculator.div(3,3);

        //Then
        Assertions.assertEquals(6, addResult);
        Assertions.assertEquals(0, subResult);
        Assertions.assertEquals(9, mulResult);
        Assertions.assertEquals(1, divResult);



    }
}
