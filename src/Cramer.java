public class Cramer {
    private int[][] arr;
    private int[][] arr1;

    public void Cramer(int[][] arr, int[][] arr1) {
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
        Matrix mat = new Matrix(fill(arr,arr1));
        mat.DetMatrix(fill(arr,arr1));

    }

    public int[][] fill(int[][] arr,int [][] arr1) {
        int num = arr.length;
        int[][] array = new int[arr.length + 1][arr.length + num];
        for (int i = 0; i < num + 1; i++) {
            for (int j = 0; j < num; j++) {
                if (i == num) {
                    array[i][j] = arr1[0][j];
                } else {
                    array[i][j] = arr[i][j];
                }
            }
        }
        return array;
    }

    public void ffff() {
    }
}
