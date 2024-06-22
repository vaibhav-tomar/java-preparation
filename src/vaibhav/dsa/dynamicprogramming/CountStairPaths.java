package vaibhav.dsa.dynamicprogramming;

public class CountStairPaths {
    public static void main(String[] args) {
        int n = 10;
        int ans = countPaths(n, new int[n + 1]);
        System.out.println(ans);
    }

    private static int countPaths(int n, int[] qb) {
        if (n == 0) return 1; // chalo hi mat
        if (n < 0) return 0;

        if (qb[n] != 0) return qb[n];
        int oneJump = countPaths(n - 1, qb);
        int twoJump = countPaths(n - 2, qb);
        int threeJump = countPaths(n - 3, qb);

        int res = oneJump + twoJump + threeJump;
        qb[n] = res;
        return res;
    }
}
