package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> noOddNumbers = new ArrayList<>();
        for(Integer even: numbers){
            if(even%2 == 0){
                noOddNumbers.add(even);
            }
        }
        return noOddNumbers;
    }

}
