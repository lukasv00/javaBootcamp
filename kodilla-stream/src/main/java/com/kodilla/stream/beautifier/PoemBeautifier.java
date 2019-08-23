package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String stringToDecorate, PoemDecorator decorator){
        return decorator.decorate(stringToDecorate);
    }
}
