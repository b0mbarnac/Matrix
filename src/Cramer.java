public class Cramer extends Matrix {
    private int[][] arr;
    private int[][] arr1;

    public Cramer(int[][] arr, int[][] arr1) {
        super(arr);
        /*int num = arr.length;
        int[][] array = new int[arr.length + 1][arr.length + num];
        for (int i = 0; i < num + 1; i++) {
            for (int j = 0; j < num; j++) {
                if (i == num) {
                    array[i][j] = arr1[0][j];
                } else {
                    array[i][j] = arr[i][j];
                }
            }
        }*/
        this.arr = arr;
        this.arr1 = arr1;
        /*Matrix mat = new Matrix(fill(arr,arr1));
        mat.DetMatrix(fill(arr,arr1));*/
    }

    public void printEquations() {
        int k = 0;
        int num = arr.length;
        int[][] array = new int[arr.length][arr[0].length + 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j == num) {
                    array[i][j] = arr1[0][k];
                    k++;
                } else {
                    array[i][j] = arr[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public void solve() {
        double[] array = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = DetMatrix(change(i))/DetMatrix(arr);
            System.out.println("x" + i + " = " + array[i]);
        }
    }

    private int[][] change(int n) {
        int[][]array = new int[arr.length][arr.length];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                array[i][j]=arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            array[i][n]=arr1[0][i];
        }
        return array;
    }
//    public int[][] iskl(int[][] arr, int i, int j) {
//        int[][] matr = new int[arr.length - 1][arr.length ];
//        int t = 0;
//        int t1 = 0;
//        for (int k = 0; k < matr.length; k++) {
//            for (int l = 0; l < matr[0].length; l++) {
//                if (i == t && j == t1) {
//                    t++;
//                    t1++;
//                    matr[k][l] = arr[t][t1];
//                    t1++;
//                } else {
//                    if (i == t) {
//                        t++;
//                        matr[k][l] = arr[t][t1];
//                        t++;
//                        t1++;
//                    } else {
//                        if (j == t1) {
//                            t1++;
//                            matr[k][l] = arr[t][t1];
//                            t1++;
//                        } else {
//                            matr[k][l] = arr[t][t1];
//                            t1++;
//                        }
//                    }
//                }
//                System.out.println(matr[k][l]);
//            }
//            t1 = 1;
//            t++;
//            System.out.println("------------");
//        }
//        return matr;
//    }
}
