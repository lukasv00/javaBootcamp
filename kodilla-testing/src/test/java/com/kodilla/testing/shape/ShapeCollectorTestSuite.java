package com.kodilla.testing.shape;

import org.junit.*;
import java.util.*;

public class ShapeCollectorTestSuite {

    @Test
    public void addFigureTest(){
        ShapeCollector figure = new ShapeCollector(new Circle());
        ArrayList<Shape> figuresList = (ArrayList<Shape>) figure.getFigures();
        figure.addFigure();
        Assert.assertEquals(1, figuresList.size());
        Assert.assertEquals(figuresList.get(0), figure.getShape());
    }
    @Test
    public void removeFigureTest(){
        ShapeCollector figure = new ShapeCollector(new Circle());
        ArrayList<Shape> figuresList = (ArrayList<Shape>) figure.getFigures();
        figure.addFigure();
        figure.removeFigure();
        Assert.assertEquals(0, figuresList.size());
    }
    @Test
    public void showFigures(){
        ShapeCollector figure = new ShapeCollector(new Circle());
        figure.addFigure();
        Assert.assertEquals(figure.getShape(), figure.showFigures(0));
    }

}
