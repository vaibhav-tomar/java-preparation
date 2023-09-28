package dsa.maths;

public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(naiveMethod(n));
        System.out.println(efficientSolution(n));
    }

    private static int efficientSolution(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + n / i;
        }
        return res;
    }

    private static int naiveMethod(int n) {
        int fact = 1;

        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        int res = 0;
        while (fact % 10 == 0) {
            res++;
            fact = fact / 10;
        }
        return res;
    }
}
