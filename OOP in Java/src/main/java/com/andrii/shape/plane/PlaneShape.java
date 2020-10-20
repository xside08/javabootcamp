package main.java.com.andrii.shape.plane;

import main.java.com.andrii.interfaces.AreaMeasurable;
import main.java.com.andrii.interfaces.PerimeterMeasurable;
import main.java.com.andrii.shape.Shape;
import main.java.com.andrii.shape.Vertex2D;


public abstract class PlaneShape extends Shape implements PerimeterMeasurable {

    public Vertex2D vertex2D;

    public PlaneShape(Vertex2D vertex2D) {
        this.vertex2D = vertex2D;
    }

    public double getDistanceBetweenVertices(Vertex2D v1, Vertex2D v2){
        return Math.sqrt(Math.pow((v1.getX() - v2.getX()), 2) + Math.pow((v1.getY() - v2.getY()), 2));
    }
}