package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {
    private Shape shape;
    private List<Shape> figures = new ArrayList<>();

    public List<Shape> getFigures() {
        return figures;
    }

    public Shape getShape() {
        return shape;
    }

    public String addFigure(Shape shape){
        figures.add(shape);
        return "Shape added";
    }

    public String removeLastFigure(){
        figures.remove(figures.size()-1);
        return "Shape removed";
    }
    public Shape showFigures(int i){ //zadanie mówi precyzyjnie o konkretnej pozycji z listy a nie wszystkich po przecinku (poprawić na wyświetlanie wszystkich elementów?)
        return figures.get(i);
    }
}
