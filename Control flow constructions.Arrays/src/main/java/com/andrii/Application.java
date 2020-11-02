package main.java.com.andrii;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        MatrixOperations matrixOperations = new MatrixOperations();

        String[][] newMatrix = matrixOperations.initializeMatrix();

        //System.out.println(matrixOperations.getDiagonal(newMatrix));
        //System.out.println(matrixOperations.getMatrixSize(newMatrix));

        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();
        int[] newArr = oneDimensionalArray.initializeOneDimensionalArray();
        System.out.println(Arrays.toString(newArr));
        oneDimensionalArray.sortArr(newArr);
        System.out.println(Arrays.toString(newArr));
        System.out.println(oneDimensionalArray.showMinNumber(newArr));
        System.out.println(oneDimensionalArray.showMaxNumber(newArr));
        oneDimensionalArray.sortArrInDesc(newArr);
        System.out.println(Arrays.toString(newArr));
        System.out.println(oneDimensionalArray.getSumofArr(newArr));
        System.out.println(Arrays.toString(newArr));
        oneDimensionalArray.toSquare(newArr);
        System.out.println(Arrays.toString(newArr));

    }
}
