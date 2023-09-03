package dsa.maths;

public class FirstDigit {
    public static void main(String[] args) {
        System.out.println(firstDigit(23412));
        System.out.println(firstDigitAnotherSolution(68723412));
    }

    public static int firstDigit(int n) {
        while (n > 10) {
            n = n / 10;
        }
        return n;
    }

    public static int firstDigitAnotherSolution(int n) {
        // Integer part of log base 10 of a number gives total number of digits - 1;
        int v = (int) Math.log10(n);
        int p = (int) Math.pow(10, v);
        return n / p;
    }
}
