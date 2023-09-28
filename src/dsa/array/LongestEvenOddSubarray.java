package dsa.array;

public class LongestEvenOddSubarray {
    public static void main(String[] args) {
        int a[] = {7, 10, 13, 14};
        int n = a.length;
        int count = 1;
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if ((a[i] % 2 == 0 && a[i - 1] % 2 != 0) || (a[i] % 2 != 0 && a[i - 1] % 2 == 0)) {
                count++;
                res = Math.max(res, count);

            } else {
                count = 1;
            }
        }
        System.out.println(res);
    }
}
