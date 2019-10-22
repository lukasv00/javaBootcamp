package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        Array numbersArray = new Array();

        double average = numbersArray.getAverage(new int[]{12,123,3,31,23}).getAsDouble();

        Assert.assertEquals(38.4, average ,0.001);
    }
}
