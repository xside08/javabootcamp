package main.java.com.andrii.shape.plane.impl;

import main.java.com.andrii.shape.Vertex2D;
import main.java.com.andrii.shape.plane.PlaneShape;

public class Triangle extends PlaneShape {
    private final Vertex2D vertex2DSecond;
    private final Vertex2D vertex2DThird;

    public Triangle(Vertex2D vertex2D, Vertex2D vertex2DSecond, Vertex2D vertex2DThird) {
        super(vertex2D);
        this.vertex2DSecond = vertex2DSecond;
        this.vertex2DThird = vertex2DThird;
    }

    @Override
    public double getPerimeter() {
        double a = getDistanceBetweenVertices(vertex2D, vertex2DSecond);
        double b = getDistanceBetweenVertices(vertex2DSecond, vertex2DThird);
        double c = getDistanceBetweenVertices(vertex2D, vertex2DThird);
        double perimetr = a + b + c;
        return perimetr;
    }

    @Override
    public double getArea() {
        double a = getDistanceBetweenVertices(vertex2D, vertex2DSecond);
        double b = getDistanceBetweenVertices(vertex2DSecond, vertex2DThird);
        double c = getDistanceBetweenVertices(vertex2D, vertex2DThird);
        double halfOfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - a) * (halfOfPerimeter - b) * (halfOfPerimeter - c));
    }
}
