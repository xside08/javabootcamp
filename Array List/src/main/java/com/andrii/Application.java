package main.java.com.andrii;

import main.java.com.andrii.lists.ListCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        ListCreator first = new ListCreator();
        List<Integer> firstArr = first.createArr();
        first.removeNumbersDivisionableByNum(firstArr, 3);
        System.out.println(firstArr);

        List<String> fruits = first.getFruits();
        System.out.println(fruits);
        first.removeDublicateFruits(fruits);
        System.out.println(fruits);

        List<String> vegetables = first.getVegetables();
        first.findingCommonItems(fruits, vegetables);


        TreeSet<String> ts = new TreeSet<>();
        ts.add("hello");
        ts.add("one");
        ts.add("two");
        ts.add("three");

        System.out.println(ts);
        TreeSet<String> res = (TreeSet<String>) ts.descendingSet();
        System.out.println(res);
    }
}
