package main.java.com.andrii.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ListCreator {

    public List<Integer> createArr() {
        return new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));
    }

    public void removeNumbersDivisionableByNum(List<Integer> arr, int number) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % number == 0) {
                arr.remove(i);
            }
        }
    }

    public void removeDuplicateFruits(List<String> arr) {
        boolean modified = false;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equalsIgnoreCase("orange")) {
                arr.set(i, "Grasper");
                modified = true;
            }
        }
        if (modified) {
            System.out.println("You have modified one item in list : " + String.join(", ", arr));
        } else {
            System.out.println("you haven't changed any item and you list is : ");
        }
    }

    public void findingCommonItems(List<String> arr, List<String> array) {
        arr.retainAll(array);
        System.out.println("common elements are : " + String.join(",", arr));
    }

    public List<String> getFruits() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Peach");
        fruits.add(1, "Banana");
        fruits.add("Coconut");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Mango");
        fruits.add("Nut");
        fruits.add("Apple");

        return fruits;
    }

    public List<String> getVegetables() {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Pomelo");
        vegetables.add("Mango");
        vegetables.add("Carrot");
        vegetables.add("Dill");
        vegetables.add("Nut");

        return vegetables;
    }

    public TreeSet<String> getTreeSetArr() {
        TreeSet<String> creatingATreeSet = new TreeSet<>();
        creatingATreeSet.add("1");
        creatingATreeSet.add("2");
        creatingATreeSet.add("3");
        creatingATreeSet.add("4");
        creatingATreeSet.add("5");
        creatingATreeSet.add("6");
        creatingATreeSet.add("7");

        return creatingATreeSet;
    }
}



