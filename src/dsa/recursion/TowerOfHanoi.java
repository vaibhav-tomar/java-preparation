package dsa.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(3, 1, 2, 3);
    }

    public static long toh(int n, int from, int to, int aux) {
        // Your code here
        if (n == 0) return 0;
        long firstStep = toh(n - 1, from, aux, to);
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        long thirdStep = toh(n - 1, aux, to, from);
        return firstStep + 1 + thirdStep;
    }
}
