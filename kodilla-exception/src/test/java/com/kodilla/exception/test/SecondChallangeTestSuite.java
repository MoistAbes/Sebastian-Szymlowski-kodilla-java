package com.kodilla.exception.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallangeTestSuite {

    //wartosci brzegowe x = np. 1.5 , 1, 0.9 , 1.9
    //wartosci brzegowe y = np 1.4 , 1.6


    @Test
    void testProbablyIWillThrowExceptionWhileXAndYAreCorrect(){
        //Given
        SecondChallange secondChallange = new SecondChallange();
        double x = 1;
        double y = 2;

        //When Then
        assertDoesNotThrow(() -> secondChallange.probablyIWillThrowException(x, y));
    }

    @Test
    @DisplayName("Test probablyIWillThrowException method while X equals 2 and Y equals 2")
    void testProbablyIWillThrowExceptionWhileXIsIncorrectAndYIsCorrect(){
        //Given
        SecondChallange secondChallange = new SecondChallange();
        double x = 2;
        double y = 2;

        assertThrows(Exception.class, () -> secondChallange.probablyIWillThrowException(x, y));
    }

    @Test
    @DisplayName("Test probablyIWillThrowException method while X equals 1 and Y equals 1.5")
    void testProbablyIWillThrowExceptionWhileXIsCorrectAndYIsIncorrect(){

        //Given
        SecondChallange secondChallange = new SecondChallange();
        double x = 1;
        double y = 1.5;

        //When Then
        assertThrows(Exception.class, () -> secondChallange.probablyIWillThrowException(x, y));

    }

    @Nested
    @DisplayName("Testing probablyIWillThrowException method x boundary values")
    class TestPropablyIWillThrowExceptionXBoundaryValues{

        @Test
        void testPropablyIWillThrowExceptionXHigherValue(){
            //Given
            SecondChallange secondChallange = new SecondChallange();
            double x = 1.9;
            double y = 2;

            //When Then
            assertDoesNotThrow(() -> secondChallange.probablyIWillThrowException(x, y));

        }

        @Test
        void testPropablyIWillThrowExceptionXLowerValue(){
            //Given
            SecondChallange secondChallange = new SecondChallange();
            double x = 1.0;
            double y = 2;

            //When Then
            assertDoesNotThrow(() -> secondChallange.probablyIWillThrowException(x, y));

        }


    }
    @Nested
    @DisplayName("Testing probablyIWillThrowException method y boundary values")
    class TestPropablyIWillThrowExceptionYBoundaryValues{

        @Test
        void testPropablyIWillThrowExceptionYHigherValue(){
            //Given
            SecondChallange secondChallange = new SecondChallange();
            double x = 1.5;
            double y = 1.6;

            //When Then
            assertDoesNotThrow(() -> secondChallange.probablyIWillThrowException(x, y));

        }

        @Test
        void testPropablyIWillThrowExceptionYLowerValue(){
            //Given
            SecondChallange secondChallange = new SecondChallange();
            double x = 1.5;
            double y = 1.4;

            //When Then
            assertDoesNotThrow(() -> secondChallange.probablyIWillThrowException(x, y));

        }


    }

}
