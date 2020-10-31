package main.java;
import main.java.com.goog.MyList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        myList.add(7);
        myList.add(72);
        myList.add(74);
        myList.add(545);
        myList.add(54);
        myList.add(222);

        System.out.println("Largest " + myList.largerOfList());
        System.out.println("Smallest " + myList.smallerOfList());
    }
}

