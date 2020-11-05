package main.java.com.andrii.lists;

import com.sun.source.tree.IfTree;

import java.util.*;

public class ListCreator {

    public List<Integer> createArr() {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));
        return arrayList;
    }

    public void removeNumbersDivisionableByNum(List<Integer> arr, int number) {
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % number == 0) {
                arr.remove(i);
            }
        }
    }

    public void removeDublicateFruits(List<String> arr) {
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
}



