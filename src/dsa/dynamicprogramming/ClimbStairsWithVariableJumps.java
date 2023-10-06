package dsa.dynamicprogramming;

public class ClimbStairsWithVariableJumps {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        int arr[] = {2, 3, 0, 2, 2, 3};

        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                dp[i] = dp[i] + dp[i + j];
            }
        }

        System.out.println(dp[0]);
    }
}
