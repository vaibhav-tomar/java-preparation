package dsa.array;

//Jagged array is an array of different no of columns in each row
public class JaggedArray {
    public static void main(String[] args) {
        int m = 4, n;
        int[][] a = new int[m][];

        for (int i = 0; i < m; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
