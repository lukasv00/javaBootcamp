package com.kodilla.stream.beautifier;

import org.junit.Assert;
import org.junit.Test;

public class BeautifierTestSuite {

    @Test
    public void testDecorator(){
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String beautifiedText = poemBeautifier.beautify("ala", a -> a+"ABC");
        Assert.assertEquals("alaABC",beautifiedText);

        String beautifiedText1 = poemBeautifier.beautify("ala", String::toUpperCase);
        Assert.assertEquals("ALA", beautifiedText1);

        String beautifiedText2 = poemBeautifier.beautify("ala", a -> "olo");
        Assert.assertEquals("olo", beautifiedText2);

        String beautifiedText3 = poemBeautifier.beautify("ala", a -> a+a);
        Assert.assertEquals("alaala", beautifiedText3);

    }
}
