package main.java.com.andrii;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public List<Integer> setArray(int a) {

        List<Integer> arr = new ArrayList<>(a);
        for (int i = 1; i <= a ; i++) {
            arr.add(i);
        }
        return arr;
        }

    public void addFirstArrayL(List<Integer> arr) {
        arr.add(0, 5);
        System.out.println(arr);
    }

    public void addInMiddleArrayL(List<Integer> a) {
        int mid = a.get(a.size()/2);
        a.add(mid, 0);
        System.out.println(a);
    }

    public void addLastArrayL(List<Integer> arr) {
        int lastIndex = arr.size()-1;
        int toGet = arr.get(lastIndex);
        arr.set(toGet - 1, 9);
        System.out.println(arr);
    }
    public List<Integer> deletingFirstElementArrayL(List<Integer> arr) {
        arr.remove(0);
        return arr;
    }

    public List<Integer> deletingLastElementArrayL(List<Integer> arr) {
        arr.remove(arr.size()-1);
        return arr;
    }
    public List<Integer> deletingMiddleElementArrayL(List<Integer> arr) {
        arr.remove(arr.size()/2);
        return arr;
    }

}
