package com.kodilla.testing.shape;

import org.hamcrest.core.IsSame;
import org.junit.*;
import java.util.*;

public class ShapeCollectorTestSuite {

    @Test
    public void addFigureTest(){
        ShapeCollector figure = new ShapeCollector();
        figure.addFigure(new Circle());
        ArrayList<Shape> figuresList = (ArrayList<Shape>) figure.getFigures();
        Assert.assertEquals(1, figuresList.size());
    }
    @Test
    public void removeFigureTest(){
        ShapeCollector figure = new ShapeCollector();
        ArrayList<Shape> figuresList = (ArrayList<Shape>) figure.getFigures();
        figure.addFigure(new Circle());
        figure.removeLastFigure();
        Assert.assertEquals(0, figuresList.size());
    }
    @Test
    public void showFigures(){
        ShapeCollector figure = new ShapeCollector();
        ArrayList<Shape> figuresList = (ArrayList<Shape>) figure.getFigures();
        figure.addFigure(new Circle());
        figure.showFigures(0);
        Assert.assertEquals(figure.showFigures(0), figuresList.get(0));
    }

}
