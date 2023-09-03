package dsa.maths;

import static dsa.maths.IsPrime.isPrimeBestSolution;

public class PrimeFactorization {

    public static void main(String[] args) {
        printPrimeFactors(260);
    }

    private static void printPrimeFactors(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrimeBestSolution(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }
    }
}
