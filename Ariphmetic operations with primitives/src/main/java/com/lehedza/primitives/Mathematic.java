package main.java.com.lehedza.primitives;

import java.util.Scanner;

public class Mathematic {
    Scanner sc = new Scanner(System.in);

    public int getSumOfInt(int a, int b) {
        return a + b;
    }

    public double getSumOfDouble(double a, double b) {
        return a + b;
    }

    public double getSumIntDouble(int a, double b) {
        return a + b;
    }

    public double getSumDoubleFloat(double a, float b) {
        return a + b;
    }

    public int getSumByteShort(byte a, short b) {
        return a + b;
    }

    public int getSumByteLong(byte a, long b) {
        return (int) (a + b);
    }

    public int resultOfDivide() {
        int res = sc.nextInt() / sc.nextInt();
        return res;
    }

    public double resultOfIncrease(){
        double res = (sc.nextDouble() * sc.nextInt());
        return res;
    }

}

