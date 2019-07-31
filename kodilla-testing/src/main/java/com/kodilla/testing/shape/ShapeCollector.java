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

    public boolean addFigure(){
        return true;
    }
    public boolean removeFigure(){
        return true;
    }
    public void showFigures(){

    }
}
