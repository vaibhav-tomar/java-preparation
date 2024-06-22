package vaibhav.dsa.dynamicprogramming;

public class ClimbStairsWithMinimumMoves {
    public static void main(String[] args) {
        int n = 6;
        Integer[] dp = new Integer[n + 1]; // null will represent ki possible rasta hi nahi hai jane ka
        int arr[] = {2, 3, 0, 2, 2, 3};

        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if (min != Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }
        }
        System.out.println(dp[0]);
    }
}
