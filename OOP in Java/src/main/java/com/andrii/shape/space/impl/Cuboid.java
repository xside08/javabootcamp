package main.java.com.andrii.shape.space.impl;

import main.java.com.andrii.shape.Vertex3D;
import main.java.com.andrii.shape.space.SpaceShape;

public class Cuboid extends SpaceShape {

    int width;
    int height;
    int depth;


    public Cuboid(Vertex3D vertex3D, int depth, int width, int height) {
        super(vertex3D);
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        double areaOfCuboid = (2 * (width * height) + 2 * (height * depth) + 2 * (depth * width));
        System.out.println(areaOfCuboid);
        return areaOfCuboid;
    }

    @Override
    public double getVolume() {
        double volumeOfCuboid = (width * height * depth);
        System.out.println(volumeOfCuboid);
        return volumeOfCuboid;
    }
}
