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

//      Task #2
        List<String> fruits = new ArrayList<>();
        fruits.add("Peach");
        fruits.add(1, "Banana");
        fruits.add("Coconut");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Nut");
        fruits.add("Apple");

        System.out.println(fruits);
        first.removeDublicateFruits(fruits);
        System.out.println(fruits);
//      Task #3
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Pamelo");
        vegetables.add("Mango");
        vegetables.add("Carrot");
        vegetables.add("Dill");
        vegetables.add("Nut");
        first.findingCommonItems(fruits, vegetables);


        TreeSet<String> ts = new TreeSet<>();
        ts.add("hello");
        ts.add("one");
        ts.add("two");
        ts.add("three");

        System.out.println(ts);
        TreeSet<String> res = (TreeSet<String>)ts.descendingSet();
        System.out.println(res);

    }
}
