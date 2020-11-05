package main.java.com.andrii;

import main.java.com.andrii.shape.Vertex2D;
import main.java.com.andrii.shape.Vertex3D;
import main.java.com.andrii.shape.plane.impl.Circle;
import main.java.com.andrii.shape.plane.impl.Rectangle;
import main.java.com.andrii.shape.plane.impl.Triangle;
import main.java.com.andrii.shape.space.impl.Cuboid;
import main.java.com.andrii.shape.space.impl.Sphere;
import main.java.com.andrii.shape.space.impl.SquarePyramid;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter a number of radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Vertex2D v = new Vertex2D(9, 7);

        Circle first = new Circle(radius, v);
        first.getPerimeter();
        first.getArea();
        Vertex2D rectangle1 = new Vertex2D(7, 4);
        Rectangle rectangle = new Rectangle(rectangle1, 6, 6);
        rectangle.getArea();
        rectangle.getPerimeter();
        Vertex2D triangleF = new Vertex2D(4, 7);
        Vertex2D triangleS = new Vertex2D(8, 3);
        Vertex2D triangleT = new Vertex2D(3, 5);


        Triangle tri = new Triangle(triangleF, triangleS, triangleT);
        tri.getPerimeter();
        Vertex3D vertexCuboid = new Vertex3D(2, 4, 6);
        Cuboid cuboid = new Cuboid(vertexCuboid, 10, 5, 6);
        cuboid.getArea();
        cuboid.getVolume();
        Sphere sphere = new Sphere(vertexCuboid, 6);
        sphere.getArea();
        sphere.getVolume();

        SquarePyramid squarePyramid = new SquarePyramid(vertexCuboid, 3, 10);
        squarePyramid.getVolume();
        squarePyramid.getArea();
    }
}
