package vaibhav.dsa.dynamicprogramming;

public class GoldMine {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;

        int a[][] = new int[m][n];
        int dp[][] = new int[m][n];

        for (int j = a[0].length - 1; j >= 0; j--) {
            for (int i = a.length - 1; i >= 0; i--) {
                if (j == a[0].length - 1) {
                    dp[i][j] = a[i][j];
                } else if (i == 0) {
                    dp[i][j] = a[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == a.length - 1) {
                    dp[i][j] = a[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = a[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i + 1][j + 1], dp[i - 1][j + 1]));
                }
            }
        }

        int max = dp[0][0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, dp[i][0]);
        }
        System.out.println(max);
    }
}
