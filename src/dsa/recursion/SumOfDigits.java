package dsa.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 9987;
        System.out.println(sumOfDigits(n, 0));
    }

    private static int sumOfDigits(int n, int sum) {
        if (n == 0) return sum;
        return sumOfDigits(n / 10, sum + n % 10);
    }
}
