package main.java.com.andrii;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer numberOne, Integer numberTwo) {
                if (numberOne % 2 == 0) {
                    if (numberTwo % 2 == 0) {
                        return numberOne - numberTwo;
                    }
                    return -1;
                } else if (numberTwo % 2 == 0) {
                    return 1;
                } else {
                    return numberOne - numberTwo;
                }
            }
        });

        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 5, 3, 4, 2, 6, 7, 8, 9, 10, 11));
        treeSet.addAll(ints);
        System.out.println("Your list checked of division by 2 and sorted in Asc " + treeSet);
    }
}

