package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Array implements ArrayOperations {

    @Override
    public OptionalDouble getAverage(int[] numbers){

        IntStream.range(0,numbers.length)
                 .forEach(n -> System.out.println(numbers[n]));

        OptionalDouble averageFromArray = IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .average();

        return averageFromArray;
    }
}
