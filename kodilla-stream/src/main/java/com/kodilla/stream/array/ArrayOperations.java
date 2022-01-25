package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){

        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));


        OptionalDouble resultAverage = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average();


        double result = resultAverage.orElse(-1);


        return result;

    }
}
