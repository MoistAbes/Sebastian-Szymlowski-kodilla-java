package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();


    public void addFigure(Shape shape){
       shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int position){
        if (position >= 0 && position < shapes.size()){
            return shapes.get(position);
        }

        return null;
    }

    public String showFigures(){
        String result = "";

        for (Shape shape : shapes)
            result += shape.getShapeName();

        return result;
    }

}
