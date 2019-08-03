package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private Shape shape;
    private List<Shape> figures = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public List<Shape> getFigures() {
        return figures;
    }

    public Shape getShape() {
        return shape;
    }

    public String addFigure(){
        figures.add(shape);
        return "Shape added";
    }

    public String removeFigure(){
        figures.remove(figures.size()-1);
        return "Shape removed";
    }
    public Shape showFigures(int i){
        return figures.get(i);
    }
}
