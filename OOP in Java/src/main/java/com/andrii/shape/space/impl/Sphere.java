package main.java.com.andrii.shape.space.impl;

import main.java.com.andrii.shape.Vertex3D;
import main.java.com.andrii.shape.space.SpaceShape;

public class Sphere extends SpaceShape {
    private final int rad;

    public Sphere(Vertex3D vertex3D, int rad) {
        super(vertex3D);
        this.rad = rad;
    }

    @Override
    public double getArea() {
        double areaOfSphere = (4 * Math.PI * Math.pow(rad, 2));
        return areaOfSphere;
    }

    @Override
    public double getVolume() {
        double volumeOfSphere = ((4.0 / 3.0) * Math.PI * Math.pow(rad, 3));
        return volumeOfSphere;
    }
}
