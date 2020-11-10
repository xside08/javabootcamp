package main.java.com.lehedza;

import main.java.com.lehedza.primitives.Mathematic;

import java.util.Scanner;

public class Application {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        double firstNum = sc.nextDouble();
        System.out.println("Enter second number: ");
        double secondNum = sc.nextDouble();

        Mathematic m = new Mathematic();
        System.out.println("Your result of increase is : " + m.getResultOfIncrease(firstNum, secondNum));
        System.out.println("Your result of substract is : " + m.getResOfSusbstract(firstNum, secondNum));
        System.out.println("Your result of divide is : " + m.getResultOfDivide(firstNum, secondNum));
        System.out.println("Your result of sum is : " + m.getResultOfSum(firstNum, secondNum));
        double res = m.getSumIntDouble(4, 3.9);
        System.out.println(res);

    }
}

