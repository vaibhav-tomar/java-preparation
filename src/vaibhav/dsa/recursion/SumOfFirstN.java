package vaibhav.dsa.recursion;

public class SumOfFirstN {
    public static void main(String[] args) {
        System.out.println(sumOfFirstN(5));
        System.out.println(sumOfFirstNTailRecursion(5, 0));
    }

    private static int sumOfFirstNTailRecursion(int n, int k) {
        if (n == 0) return k;
        return sumOfFirstNTailRecursion(n - 1, k + n);
    }

    private static int sumOfFirstN(int n) {
        if (n == 0) return 0;
        return n + sumOfFirstN(n - 1);
    }
}
