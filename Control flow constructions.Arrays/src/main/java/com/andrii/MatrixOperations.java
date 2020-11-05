package main.java.com.andrii;

public class MatrixOperations {

    public MatrixOperations() {

    }

    public String getDiagonal(String[][] newMass) {
        String new2 = "";
        for (int x = 0; x < newMass.length; x++) {
            for (int z = 0; z < newMass[x].length; z++) {
                if (x == z) {
                    new2 = new2 + " " + newMass[x][z];
                }
            }
        }
        return new2;
    }

    public String[][] initializeMatrix() {
        String[] first = {"Привіт", "Me", "You", "Welcome"};
        String[] second = {"Quit", "незнайомцю", "Busy", "Walking"};
        String[] third = {"Darkness", "Smile", "радий", "Like"};
        String[] fourth = {"time", "of", "Sadness", "бачити"};

        String[][] newMass = {first, second, third, fourth};
        return newMass;
    }

    public int getMatrixSize(String[][] matrix) {
        return matrix.length;
    }
}
