package dsa.stack;

public class LargestRectangleWithAllOne {
    public static void main(String[] args) {
        int r = 5, c = 5;
        int a[][] = new int[r][c];
        int res = largestHiostogram(a[0]);

        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == 1) {
                    a[i][j] = a[i][j] + a[i - 1][j];
                }
            }
            res = Math.max(res, largestHiostogram(a[i]));
        }

        System.out.println(res);
    }

    private static int largestHiostogram(int[] ints) {
        return 0;
    }
}
