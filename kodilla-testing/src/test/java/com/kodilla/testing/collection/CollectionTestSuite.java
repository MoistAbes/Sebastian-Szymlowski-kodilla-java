package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName(
            "When OddNumbersExterminator is used on, " +
                    "empty List it should also return empty List"
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(new ArrayList<>());
        System.out.println("Testing " + result);

        //Then
        Assertions.assertEquals(new ArrayList<Integer>(), result);

    }


    @DisplayName(
            "When OddNumbersExterminator is used on list with odd and even numbers, " +
                    "then it should return a List with only even numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        Integer[] testNumbersArray = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> testNumbers = Arrays.asList(testNumbersArray);
        List<Integer> result = oddNumbersExterminator.exterminate(testNumbers);

        Integer[] expectedResultArray = new Integer[]{2, 4, 6, 8, 10};
        List<Integer> expectedResult = Arrays.asList(expectedResultArray);

        System.out.println("Testing " + testNumbers);

        //Then
        Assertions.assertEquals(expectedResult, result);
    }




}
