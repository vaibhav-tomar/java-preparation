package dsa.maths;

public class AllDivisors {
    public static void main(String[] args) {
        int a = 27;
        // Solution - 1: Naive Method O(n)
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) System.out.println(i);
        }


        // Solution - 2: O(sqtr(n)) unsorted
        // divisors always appear in pairs
        for (int i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
                if (i != a / i) System.out.println(a / i);
            }
        }


        // Solution - 3: O(sqrt(n)) sorted
        int i;
        // first loop from 1(inclusive to sqrt(n) (exclusive)
        for (i = 1; i * i < a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
        // second loop from sqrt(n) (inclusive) to 1(inclusive)
        for (; i >= 1; i--) {
            if (a % i == 0) {
                System.out.println(a / i);
            }
        }

    }
}
