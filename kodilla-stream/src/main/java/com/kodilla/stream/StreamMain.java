package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String beautifiedText = poemBeautifier.beautify("ala", a -> a+"ABC");

        String beautifiedText1 = poemBeautifier.beautify("ala", String::toUpperCase);

        String beautifiedText2 = poemBeautifier.beautify("ala", a -> "olo");

        String beautifiedText3 = poemBeautifier.beautify("ala", a -> a+a);

    }
}
