package dsa.dynamicprogramming;

public class MinimumCostPath {
    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        int a[][] = new int[n][m];
        int dp[][] = new int[n][m];

        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if (i == dp.length - 1 && j == dp[0].length - 1) {
                    dp[i][j] = a[i][j];
                } else if (i == dp.length - 1) {
                    dp[i][j] = dp[i][j + 1] + a[i][j];
                } else if (j == dp[0].length - 1) {
                    dp[i][j] = dp[i + 1][j] + a[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + a[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
