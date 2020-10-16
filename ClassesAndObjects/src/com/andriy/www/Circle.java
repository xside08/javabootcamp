package com.andriy.www;

import java.util.Scanner;

public class Circle {

    static Scanner x = new Scanner(System.in);

    static void countASquare() {
        System.out.println("Enter a radius of circle");
        double radius = x.nextDouble();
        System.out.println("you have entered " + radius);
        double sqr = (Math.pow(radius, 2) * Math.PI);
        System.out.println("square of circle with " + radius + " radius are " + sqr);
    }
}