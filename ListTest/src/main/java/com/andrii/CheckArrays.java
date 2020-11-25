package main.java.com.andrii;

import java.util.List;

public class CheckArrays {

    public void checkArrays(MyArrayList myArrayList, List<Integer> arrayL) {
        long startTime = System.currentTimeMillis();

        myArrayList.addAt(arrayL, 5, 10);
        myArrayList.addAt(arrayL, arrayL.size() / 2, 10);
        myArrayList.addAt(arrayL, arrayL.size()-1, 10);
        myArrayList.deletingElement(arrayL, 32);
        myArrayList.deletingElement(arrayL, arrayL.size()-1);
        myArrayList.deletingElement(arrayL, arrayL.size()/2);

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("for operations with ArrayList we spent " + elapsedTime);

    }

    public void checkLinkedArrays(MyLinkedList myLinkedList, List<Integer> list) {
        long startTime = System.currentTimeMillis();

        myLinkedList.addAt(list, 8, 23);
        myLinkedList.addAt(list, list.size() / 2, 23);
        myLinkedList.addAt(list, list.size()-1, 92);
        myLinkedList.deletingElement(list, 23);
        myLinkedList.deletingElement(list, list.size() /2);
        myLinkedList.deletingElement(list, list.size()-1);

        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("for operations with LinkedList we spent " + elapsedTime);
    }
}
