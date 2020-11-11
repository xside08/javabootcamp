package main.java.com.andrii;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        MatrixOperations matrixOperations = new MatrixOperations();

        String[][] newMatrix = matrixOperations.initializeMatrix();

        System.out.println("Diagonal line of your matrix is: " + matrixOperations.getDiagonal(newMatrix));
        System.out.println("Matrix size is : " + matrixOperations.getMatrixSize(newMatrix));

        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();
        int[] newArr = oneDimensionalArray.initializeOneDimensionalArray(30);
        System.out.println("we have created array with these numbers : " + Arrays.toString(newArr));
        oneDimensionalArray.sortArr(newArr);
        System.out.println("our array sorted in increasing way" + Arrays.toString(newArr));
        System.out.println("this is a min number of our array : " + oneDimensionalArray.showMinNumber(newArr));
        System.out.println("this is a max number of our array : " + oneDimensionalArray.showMaxNumber(newArr));
        oneDimensionalArray.sortArrInDesc(newArr);
        System.out.println("our array sorted in descending way " + Arrays.toString(newArr));
        System.out.println("sum of all numbers in our array is : " + oneDimensionalArray.getSumofArr(newArr));
        oneDimensionalArray.toSquare(newArr);
        System.out.println("each element of our array got to pow " + Arrays.toString(newArr));
    }
}
