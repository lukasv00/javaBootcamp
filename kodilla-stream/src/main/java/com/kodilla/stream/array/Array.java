package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Array implements ArrayOperations {

    @Override
    public OptionalDouble getAverage(int[] numbers){

        // void numbersPrint = IntStream.range(0,numbers.length)
        //       .forEach(System.out::println);

        OptionalDouble averageFromArray = IntStream.range(0,numbers.length)
                .average();

        return averageFromArray;
    }
}
