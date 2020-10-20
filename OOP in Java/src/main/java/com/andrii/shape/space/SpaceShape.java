package main.java.com.andrii.shape.space;

import main.java.com.andrii.interfaces.VolumeMeasurable;
import main.java.com.andrii.shape.Shape;
import main.java.com.andrii.shape.Vertex2D;
import main.java.com.andrii.shape.Vertex3D;
import main.java.com.andrii.shape.plane.PlaneShape;

public abstract class SpaceShape extends Shape implements VolumeMeasurable {
    public Vertex3D vertex3D;

    public SpaceShape(Vertex3D vertex3D){
        this.vertex3D = vertex3D;
    }

}
