package dsa.array;

public class MaximumDifference {


    public static void main(String[] args) {
        int a[] = {2, 3, 10, 6, 4, 8, 1};
        int n = a.length;
        int maxDiff = Integer.MIN_VALUE;
        if (n == 1) maxDiff = a[0];
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] - min > maxDiff) {
                maxDiff = a[i] - min;
            }
        }
        System.out.println(maxDiff);
    }
}
