package main.java.com.andrii.shape.plane.impl;

import main.java.com.andrii.shape.Vertex2D;
import main.java.com.andrii.shape.plane.PlaneShape;

public class Circle extends PlaneShape {

    private final double radius;
    //private Vertex2D vertex2D;

    public Circle(double radius, Vertex2D vertex2D) {
        super(vertex2D);
        this.radius = radius;
        System.out.println("You have created a circle with radius " + radius + "\n");
    }


    @Override
    public double getPerimeter() {
        double perimetrOfCircle = (Math.PI * 2 * radius);
        System.out.println("Perimetr is " + perimetrOfCircle);
        return perimetrOfCircle;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle with radius : " + radius + " is " + area);
        return area;
    }

    public double getRadius() {
        return radius;
    }

}
