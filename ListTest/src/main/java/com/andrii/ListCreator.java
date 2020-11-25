package main.java.com.andrii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCreator {

    public List<Integer> createArrayList(int size) {
        List<Integer> array = new ArrayList<>(size);
        fillList(size, array);
        return array;
    }
    public List<Integer> createLinkedList(int size) {
        List<Integer> list = new LinkedList<>();
        fillList(size, list);
        return list;
    }

    private void fillList(int size, List<Integer> list) {
        for (int i = 1; i < size; i++) {
            list.add(i);
        }
    }
}
