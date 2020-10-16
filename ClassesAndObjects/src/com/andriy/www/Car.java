package com.andriy.www;

import java.util.Scanner;

public class Car {
    static boolean ignition = false;
    static Scanner speed = new Scanner(System.in);

    static void startEngine () {

        if (ignition == true) {
            System.out.println("Your car is already working");
        } else {
            ignition = true;
            System.out.println("let's go!");
        }
    }

    static void stopEngine () {

        if (ignition == true) {
            System.out.println("please, stop a car");
            ignition = false;
        }else {
            System.out.println("your engine isn't working");
        }
    }

    static void riding() {
        System.out.println("we are driving to somewhere");
    }

    static void setSpeed() {
        System.out.println("ener desired speed here");
        int speedSet = speed.nextInt();
        System.out.println("your speed is " + speedSet + " km/h");
    }
}
