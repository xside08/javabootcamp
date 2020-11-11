package main.java.com.andrii.shape.space.impl;

import main.java.com.andrii.shape.Vertex3D;
import main.java.com.andrii.shape.space.SpaceShape;

public class SquarePyramid extends SpaceShape {
    int width;
    int height;

    public SquarePyramid(Vertex3D vertex3D, int width, int height) {
        super(vertex3D);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getVolume() {
        double volumeOfSquarePiramid = ((1.0 / 3.0) * Math.pow(width, 2) * height);
        return volumeOfSquarePiramid;
    }

    @Override
    public double getArea() {
        double areaOfSquarePiramid = ((width * width) + 2 * width * height);
        return areaOfSquarePiramid;
    }
}
