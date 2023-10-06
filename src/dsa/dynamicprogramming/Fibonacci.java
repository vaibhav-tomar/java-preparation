package dsa.dynamicprogramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int memo[] = new int[n + 1];

        int ans = getFibonacci(n, memo);
        System.out.println(ans);
    }

    private static int getFibonacci(int n, int[] memo) {
        if (n == 0 || n == 1) return n;

        if (memo[n] != 0) return memo[n];
        int res = getFibonacci(n - 1, memo) + getFibonacci(n - 2, memo);
        memo[n] = res;
        return res;
    }
}
