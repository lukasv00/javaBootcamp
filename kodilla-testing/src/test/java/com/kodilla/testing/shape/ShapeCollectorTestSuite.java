package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void addFigureTest(Shape shape){
        ShapeCollector figure = new ShapeCollector(new Circle());
        figure.addFigure();
        Assert.assertNotNull(shape);
    }
    @Test
    public void removeFigureTest(Shape shape){
        ShapeCollector figure = new ShapeCollector(new Circle());
        figure.removeFigure();
        Assert.assertTrue(figure.removeFigure());
    }
    @Test
    public void showFigures(int i){
        ShapeCollector figuresList = new ShapeCollector(new Circle());
        figuresList.showFigures();
        Assert.assertNotNull(figuresList.getFigures());
    }

}
