package main.java.com.andrii;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ListCreator array = new ListCreator();
        List<Integer> one = array.createArrayList(78);
        List<Integer> two = array.createLinkedList(923);

        MyArrayList myArrayList = new MyArrayList();
        MyLinkedList myLinkedList = new MyLinkedList();

        CheckArrays checker = new CheckArrays();
        checker.checkArrays(myArrayList, two);

        checker.checkLinkedArrays(myLinkedList, one);
    }
}