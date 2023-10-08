package dsa.dynamicprogramming;

public class CoinChangeCombination {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 6};
        int amount = 10;

        int dp[] = new int[amount + 1];
        dp[0] = 1;

        for (int i = 0; i < a.length; i++) {
            for (int j = a[i]; j < dp.length; j++) {
                dp[j] = dp[j] + dp[j - a[i]];
            }
        }

        System.out.println(dp[amount]);
    }
}
