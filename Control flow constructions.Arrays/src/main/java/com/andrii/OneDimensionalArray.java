package main.java.com.andrii;

import java.util.Arrays;

public class OneDimensionalArray {

    public int[] initializeOneDimensionalArray(int num) {
        int[] first = new int[num];
        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * 70 + 1);
        }
        return first;
    }

    public void sortArr(int[] array) {
        Arrays.sort(array);
    }

    public int showMinNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public int showMaxNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public void sortArrInDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
    }

    public int getSumofArr(int[] arr) {
        int a = 0;
        for (int i : arr) {
            a += i;
        }
        return a;
    }


    public void toSquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 2);
        }
    }
}
