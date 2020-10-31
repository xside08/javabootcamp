package main.java.com.lehedza;

import main.java.com.lehedza.primitives.Mathematic;

public class Application {
    public static void main(String[] args) {

        Mathematic m = new Mathematic();
        System.out.println(m.getSumOfInt(3, 5));
        System.out.println(m.getSumOfDouble(4.2, 5d));
        System.out.println("your result is : " + m.resultOfDivide());
        System.out.println("hello " + m.resultOfIncrease() + " times!");

    }
}

