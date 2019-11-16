package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.sql.SQLOutput;
import java.util.*;

public class TestingMain {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(12, 313, 414, 2, 31, 24, 523, 28, 30, 2));

        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();

        numbersExterminator.exterminate(numbers);

    }
}
