package com.andriy.www;

public class Circle {

    private int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    int countASquare() {
        double sqr = (Math.pow(rad, 2) * Math.PI);
        return (int) sqr;
    }

    public int getRad() {
        return rad;
    }
}