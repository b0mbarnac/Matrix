import java.util.Random;

public class Matrix {
    private int[][] arr;

    public Matrix(int[][] arr) {
        this.arr = arr;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(this.arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public int[][] iskl(int[][] arr, int i, int j) {
        int[][] matr = new int[arr.length - 1][arr.length - 1];
        int t = 0;
        int t1 = 0;
        for (int k = 0; k < matr.length; k++) {
            for (int l = 0; l < matr[0].length; l++) {
                if (i == t && j == t1) {
                    t++;
                    t1++;
                    matr[k][l] = arr[t][t1];
                    t1++;
                } else {
                    if (i == t) {
                        t++;
                        matr[k][l] = arr[t][t1];
                        t++;
                        t1++;
                    } else {
                        if (j == t1) {
                            t1++;
                            matr[k][l] = arr[t][t1];
                            t1++;
                        } else {
                            matr[k][l] = arr[t][t1];
                            t1++;
                        }
                    }
                }
                System.out.println(matr[k][l]);
            }
            t1 = 1;
            t++;
            System.out.println("------------");
        }
        return matr;
    }

    public double DetMatrix(int[][] arr) {
        double d = 0;
        if (arr.length == 1) {
            return arr[0][0];
        } else {
            if (arr.length == 2) {
                return arr[0][0] * arr[1][1] - (arr[1][0] * arr[0][1]);
            }  else {
                int[][] matr = new int[arr.length - 1][arr.length - 1];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 1; j < arr.length; j++) {
                        //d = d + arr[i][j]*Math.pow(-1,i+j)*DetMatrix(iskl(arr,i,j));
                        for (int g = 0; g < arr.length; g++) {
                            if (g < i) {
                                matr[j - 1][g] = arr[j][g];
                            }
                            if (g > i) {
                                matr[j - 1][g - 1] = arr[j][g];
                            }
                        }
                    }
                    d+=arr[0][i]*DetMatrix(matr)*Math.pow(-1,i+2);
                }
            }
        }
        return d;
    }


    public void fill(int[][] array) {
        Random r = new Random();
        int[][] arr = new int[array.length][array[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = array[i][j];
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
