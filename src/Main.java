import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько уравнений? ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int[][] arr1 = new int[1][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Введи коэф. " + (int) (i + 1) + "ой строки " + (int) (j + 1) + "го столбца");
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < arr1[0].length; i++) {
            System.out.println("Введите чему равно " + (int)(i+1) + "е уравнение");
            arr1[0][i] = in.nextInt();
        }

        Matrix mat = new Matrix(arr);
        //mat.printMatrix();
        double deter = mat.DetMatrix(arr);
        Cramer cramer = new Cramer(arr, arr1);
        cramer.printEquations();
        System.out.println(deter);
        cramer.solve();
    }
}
