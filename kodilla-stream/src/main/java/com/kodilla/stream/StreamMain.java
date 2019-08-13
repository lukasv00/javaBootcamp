package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String beautifiedText = poemBeautifier.bautify("ala", a -> a+"ABC");
        System.out.println(beautifiedText);

        String beautifiedText1 = poemBeautifier.bautify("ala", String::toUpperCase);
        System.out.println(beautifiedText1);

        String beautifiedText2 = poemBeautifier.bautify("ala", a -> "olo");
        System.out.println(beautifiedText2);

        String beautifiedText3 = poemBeautifier.bautify("ala", a->a+a);
        System.out.println(beautifiedText3);

        System.out.println("Stream for even numbers 1 - 20");
        NumbersGenerator.generateEven(20);


    }
}
