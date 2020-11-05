package main.java.com.andrii.shape.plane.impl;

import main.java.com.andrii.shape.Vertex2D;
import main.java.com.andrii.shape.plane.PlaneShape;

public class Triangle extends PlaneShape {
    private final Vertex2D vertex2DSecond;
    private final Vertex2D vertex2DThird;
    double a;
    double b;
    double c;
    double perimetr;


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
        System.out.println(perimetr);
        return perimetr;
    }

    @Override
    public double getArea() {

        return 0;
    }

//    public Vertex2D getVertex2DFirst() {
//        return vertex2DFirst;
//    }

    public Vertex2D getVertex2DSecond() {
        return vertex2DSecond;
    }

    public Vertex2D getVertex2DThird() {
        return vertex2DThird;
    }
}
