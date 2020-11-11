package com.andriy.www;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Circle circle1 = new Circle(34);
        System.out.println("Your circle has a square with radius " + circle1.getRad() + " is equal : " + circle1.countASquare());
        System.out.println();


        System.out.println("enter desired speed bellow: ");
        Scanner sc = new Scanner(System.in);

        Car vw = new Car();

        int userSpeed = sc.nextInt();

        vw.startEngine();

        vw.setSpeed(userSpeed);

        System.out.println("You choosed driving speed " + vw.getSpeed() + " km/h");
        vw.riding(userSpeed);

        vw.stopEngine();


        CounterOfClassCreated class1 = new CounterOfClassCreated();
        CounterOfClassCreated class3 = new CounterOfClassCreated();
        CounterOfClassCreated class5 = new CounterOfClassCreated();
        CounterOfClassCreated class4 = new CounterOfClassCreated();

        System.out.println("You have created " + class3.count + " instances of Class Counter");


    }
}
