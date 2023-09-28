package dsa.maths;

public class Palindrome {
    public static void main(String[] args) {
        int n = 4567654;

        int reverse = reverseNumber(n);
        System.out.println(reverse == n);
    }

    private static int reverseNumber(int n) {
        int newNumber = 0;
        while (n > 0) {
            int rem = n % 10;
            newNumber = newNumber * 10 + rem;
            n = n / 10;
        }
        return newNumber;
    }
}
