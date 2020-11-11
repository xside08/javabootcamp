package main.java.com.andrii.shape.plane.impl;

import main.java.com.andrii.shape.Vertex2D;
import main.java.com.andrii.shape.plane.PlaneShape;

public class Circle extends PlaneShape {

    private final double radius;

    public Circle(double radius, Vertex2D vertex2D) {
        super(vertex2D);
        this.radius = radius;
    }


    @Override
    public double getPerimeter() {
        double perimetrOfCircle = (Math.PI * 2 * radius);
        return perimetrOfCircle;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getRadius() {
        return radius;
    }
}
