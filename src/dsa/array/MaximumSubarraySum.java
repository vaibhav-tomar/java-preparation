package dsa.array;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        int a[] = {-5, 1, -2, 3, -1, 2, -2};
        int n = a.length;
        int res = a[0];
        int maxEnd = a[0];
        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(a[i], a[i] + maxEnd);
            res = Math.max(res, maxEnd);
        }
        System.out.println(res);
    }
}
