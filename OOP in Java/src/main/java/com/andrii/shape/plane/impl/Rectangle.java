package main.java.com.andrii.shape.plane.impl;

import main.java.com.andrii.shape.Vertex2D;
import main.java.com.andrii.shape.plane.PlaneShape;

public class Rectangle extends PlaneShape {

    private final int width;
    private final int height;

    public Rectangle(Vertex2D vertex2D, int width, int height){
        super(vertex2D);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        double perimeterOfRectangle = 2 * (width + height);
        System.out.println("Perimeter is " + perimeterOfRectangle);
        return perimeterOfRectangle;
    }

    @Override
    public double getArea() {
        double areaOfRectangle = width * height;
        System.out.println("Area is " + areaOfRectangle);
        return areaOfRectangle;
    }

    public Vertex2D getVertexFirst() {
        return this.vertex2D;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}