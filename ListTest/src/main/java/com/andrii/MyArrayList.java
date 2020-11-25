package main.java.com.andrii;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public void addAt(List<Integer> arr, int index, int number) {
        arr.add(index, number);
    }

    public void deletingElement(List<Integer> arr, int indexForDeleting) {
        arr.remove(indexForDeleting);
    }
}
