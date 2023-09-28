package dsa.array;

public class Leader {
    public static void main(String[] args) {
        int a[] = {7, 10, 4, 3, 6, 5, 2};
        int n = a.length;
        int max = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > max) {
                System.out.println(a[i]);
                max = a[i];
            }
        }
    }
}
