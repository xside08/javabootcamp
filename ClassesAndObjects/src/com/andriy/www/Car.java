package com.andriy.www;

public class Car {
    private boolean ignition;
    private int speed;

    public void startEngine() {
        if (ignition) {
            System.out.println("Your car is already working");
        } else {
            ignition = true;
            System.out.println("We can drive because your ignition is on now!");
        }
    }

    public void stopEngine() {
        if (ignition) {
            System.out.println("If you're going to stop a car. Please, reduce speed and turn off ignition");
            ignition = false;
        } else {
            System.out.println("your engine isn't working");
        }
    }

    public void riding(int speed) {
        if (speed >= 90 && speed < 350) {
            System.out.println("be aware - speed is to hight");
        } else if (speed >= 60 && speed < 90) {
            System.out.println("U driving safetly!");
        } else if (speed > 0 && speed < 60) {
            System.out.println("U're too slow. Anything wrong?");
        } else {
            System.out.println("Choose correct speed, please!");
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isIgnition() {
        return ignition;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    public int getSpeed() {
        return speed;
    }
}
