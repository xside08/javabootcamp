package main.java.com.andrii;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        List<Integer> arrayL = myArrayList.setArray(50_000);

        MyLinkedList myLinkedList = new MyLinkedList();
        List<Integer> linkedL = myLinkedList.link(50_000);

        myArrayList.addFirstArrayL(arrayL);
        myArrayList.addInMiddleArrayL(arrayL);
        myArrayList.addLastArrayL(arrayL);
        myArrayList.deletingFirstElementArrayL(arrayL);
        myArrayList.deletingMiddleElementArrayL(arrayL);
        myArrayList.deletingLastElementArrayL(arrayL);

        myLinkedList.addFirstLinkedL(linkedL);
        myLinkedList.addInMiddle(linkedL);
        myLinkedList.addLastInLinkedL(linkedL);
        myLinkedList.deletingFirstElementLinkedL(linkedL);
        myLinkedList.deletingMiddleElementLinkedL(linkedL);
        myLinkedList.deletingLastElementLinkedL(linkedL);


        long startTime = System.currentTimeMillis();

        long finishTime = System.currentTimeMillis();
        long elapsedTime = finishTime - startTime;

        long startTime1 = System.currentTimeMillis();

        long finishTime1 = System.currentTimeMillis();
        long elapsedTime1 = finishTime1 - startTime1;

        System.out.println("Time for adding first element in ArrayList is " + elapsedTime );
        System.out.println("Time for adding first element in LinkedList is " + elapsedTime1 );
    }
}