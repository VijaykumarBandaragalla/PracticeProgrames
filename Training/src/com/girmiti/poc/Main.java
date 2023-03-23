package com.girmiti.poc;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("rectangle");
        shape.draw();  // Output: Drawing a rectangle

        shape = shapeFactory.getShape("circle");
        shape.draw();  // Output: Drawing a circle

        shape = shapeFactory.getShape("square");
        shape.draw();  // Output: Drawing a square

        shape = shapeFactory.getShape("triangle");
        System.out.println(shape);  // Output: null
    }
}
