package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){

        //Given
        int[] numbers = new int[]{1, 2, 4, 6, 2, 4, 5};

        //When
        double resultAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(3.4 , resultAverage, 0.1);

    }

}
