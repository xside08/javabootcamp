package main.java.com.andriy;

public class MultiplyArr {
    public static void main(String[] args) {

        int[][] array = new int[2][2];
        array[0][0] = 1;
        array[0][1] = 4;
        array[1][0] = 8;
        array[1][1] = 9;

        for(int i = 0; i<array.length; i++){
            for( int j = 0; j<array[i].length; j++){
                System.out.println(array[i][j]+ " hj");
            }

            System.out.println("////");
        }
    }
}
