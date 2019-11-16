package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void addTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double add = calculator.add(1, 2);

        Assert.assertEquals(3, add, 0.01);
    }

    @Test
    public void subTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double sub = calculator.sub(1, 2);

        Assert.assertEquals(-1, sub, 0.01);
    }

    @Test
    public void mulTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double mul = calculator.mul(1, 2);

        Assert.assertEquals(2, mul, 0.01);
    }

    @Test
    public void divTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double div = calculator.div(1, 2);

        Assert.assertEquals(0.5, div, 0.01);
    }
}
