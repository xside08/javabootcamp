package main.java.com.andrii;

import java.util.List;

public class MyLinkedList {

    public void addAt(List<Integer> linkedList, int index, int numberToAdding) {
        linkedList.add(index, numberToAdding);
    }

    public void deletingElement(List<Integer> arr, int indexForDeleting) {
        arr.remove(indexForDeleting);
    }
}
