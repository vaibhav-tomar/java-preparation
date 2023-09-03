package dsa.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int a[] = {3, 4, 3, -1, 1};
        System.out.println(detectSunarrayWithZeroSum(a));
    }

    private static boolean detectSunarrayWithZeroSum(int[] a) {
        Set<Integer> h = new HashSet<>();
        int prefixSum = 0;
        for (int i = 0; i < a.length; i++) {
            prefixSum += a[i];
            if (h.contains(prefixSum)) return true;
            if (prefixSum == 0) return true;
            h.add(prefixSum);
        }
        return false;
    }
}
