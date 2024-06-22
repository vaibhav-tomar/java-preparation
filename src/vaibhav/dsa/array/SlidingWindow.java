package vaibhav.dsa.array;

public class SlidingWindow {
    public static void main(String[] args) {
        int a[] = {10, 5, -2, 20, 1};
        int n = a.length;
        int k = 3;

        int sum = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        res = sum;
        for (int i = k; i < n; i++) {
            res = Math.max(res, sum - a[i - k] + a[i]);
        }
        System.out.println(res);
    }

}
