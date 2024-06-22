package vaibhav.dsa.sorting;

import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int a[] = {10, 8, 1, 4};
        Arrays.sort(a);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            res = Math.min(res, Math.abs(a[i] - a[i + 1]));
        }
        System.out.println(res);
    }
}
