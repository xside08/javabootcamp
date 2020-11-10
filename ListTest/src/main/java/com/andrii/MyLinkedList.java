package main.java.com.andrii;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {


    public List<Integer> link(int n) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i < n; i++) {
            list.add(i);
        }
        return list;
    }

    public void addFirstLinkedL(List<Integer> linkedList) {
        linkedList.add(0, 9);
        System.out.println(linkedList);
    }

    public void addInMiddle(List<Integer> li) {
        int firstIndex = li.get(0);
        int lastIndex = li.get(li.size()-1);
        int mid = firstIndex + (lastIndex-firstIndex)/2;
        li.set(mid, 0);
    }

    public List<Integer> addLastInLinkedL(List<Integer> arr) {
        int ind = arr.get(arr.size()-1);
        arr.add(ind, 888);
        return arr;
    }

    public List<Integer> deletingFirstElementLinkedL(List<Integer> arr) {
        arr.remove(0);
        return arr;
    }

    public List<Integer> deletingLastElementLinkedL(List<Integer> arr) {
        arr.remove(arr.size()-1);
        return arr;
    }
    public List<Integer> deletingMiddleElementLinkedL(List<Integer> arr) {
        arr.remove(arr.size()/2);
        return arr;
    }


}
