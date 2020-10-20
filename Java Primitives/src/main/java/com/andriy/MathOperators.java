package main.java.com.andriy;

import java.util.Arrays;

public class MathOperators {
    public static void main(String[] args) {

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 70 + 1);
        }

        int min = numbers[0];
        int max = numbers[0];


        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println(min);
        System.out.println(max);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Array in descending order:");

        for (int i = 19; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sum = Arrays.stream(numbers).sum();
        System.out.println("The sum is " + sum);
    }
}


