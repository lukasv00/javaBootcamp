package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Triangle;
import com.kodilla.spring.shape.Square;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {

    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("circle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("Circle", name);
    }

    @Test
    public void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("triangle");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("Triangle", name);
    }

    @Test
    public void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Shape shape = (Shape) context.getBean("square");
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("Square", name);
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Shape shape = (Shape) context.getBean("chosenShape");
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Chosen shape says: " + name);
    }
}
