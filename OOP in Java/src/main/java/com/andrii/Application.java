package main.java.com.andrii;

import main.java.com.andrii.shape.Vertex2D;
import main.java.com.andrii.shape.Vertex3D;
import main.java.com.andrii.shape.plane.impl.Circle;
import main.java.com.andrii.shape.plane.impl.Rectangle;
import main.java.com.andrii.shape.plane.impl.Triangle;
import main.java.com.andrii.shape.space.impl.Cuboid;
import main.java.com.andrii.shape.space.impl.Sphere;
import main.java.com.andrii.shape.space.impl.SquarePyramid;

public class Application {
    public static void main(String[] args) {

        Vertex2D v = new Vertex2D(9, 7);
        System.out.println("***Circle***");
        Circle first = new Circle(8, v);
        System.out.println("Perimetr of circle with radius " + first.getRadius() + " is " + first.getPerimeter());
        System.out.println("Area of circle with radius " + first.getRadius() + " is " + first.getArea());

        System.out.println("***Rectangle***");
        Vertex2D rectangle1 = new Vertex2D(7, 4);
        Rectangle rectangle = new Rectangle(rectangle1, 6, 6);
        System.out.println("Perimetr of rectangle with " + rectangle.getWidth() + " width and " + rectangle.getHeight() + " height is " + rectangle.getPerimeter());
        System.out.println("Area of rectangle with " + rectangle.getWidth() + " width and " + rectangle.getHeight() + " height is " + rectangle.getArea());


        Vertex2D triangleF = new Vertex2D(4, 7);
        Vertex2D triangleS = new Vertex2D(8, 3);
        Vertex2D triangleT = new Vertex2D(3, 5);

        System.out.println("***Triangle***");
        Triangle tri = new Triangle(triangleF, triangleS, triangleT);
        System.out.println("Perimetr of triangle is " + tri.getPerimeter());

        System.out.println("***Cuboid***");
        Vertex3D vertexCuboid = new Vertex3D(2, 4, 6);
        Cuboid cuboid = new Cuboid(vertexCuboid, 10, 5, 6);
        System.out.println("Area of cuboid is " + cuboid.getArea());
        System.out.println("Volume of cuboid is " + cuboid.getVolume());


        System.out.println("***Sphere***");
        Sphere sphere = new Sphere(vertexCuboid, 6);

        System.out.println("Area of sphera is " + sphere.getArea());
        System.out.println("Volume of sphera is " + sphere.getVolume());

        System.out.println("***Square Pyramid***");
        SquarePyramid squarePyramid = new SquarePyramid(vertexCuboid, 3, 10);

        System.out.println("Area of square piramid is " + squarePyramid.getArea());
        System.out.println("Volume of square piramid is " + squarePyramid.getVolume());
    }
}
