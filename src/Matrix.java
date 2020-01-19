import java.util.Random;

public class Matrix {
    private int[][] arr;

    public Matrix(int[][] arr) {
        this.arr = arr;
    }

    public void printMatrix(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(this.arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }


    public double DetMatrix(int[][] arr) {
        double d = 0;
        if (arr.length == 1) {
            return arr[0][0];
        } else {
            if (arr.length == 2) {
                return arr[0][0] * arr[1][1] - (arr[1][0] * arr[0][1]);
            } else {
                int[][] matr = new int[arr.length - 1][arr.length - 1];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 1; j < arr.length; j++) {
                        for (int g = 0; g < arr.length; g++) {
                            if (g < i) {
                                matr[j - 1][g] = arr[j][g];
                            }
                            if (g > i) {
                                matr[j - 1][g - 1] = arr[j][g];
                            }
                        }
                    }
                    d += arr[0][i] * DetMatrix(matr) * Math.pow(-1, i + 2);
                }
            }
        }
        return d;
    }

}
