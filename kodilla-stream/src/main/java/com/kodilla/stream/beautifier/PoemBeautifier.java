package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String bautify(String a, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(a);
        return result;
    }
}
