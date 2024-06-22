package vaibhav.dsa.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        int a[] = {5, 8, 6, 13, 3, -1};
        int sum = 22;
        System.out.println(detectSubarrayWithGivenSum(a, sum));
    }

    private static boolean detectSubarrayWithGivenSum(int[] a, int sum) {
        Set<Integer> h = new HashSet<>();
        int prefixSum = 0;
        for (int i = 0; i < a.length; i++) {
            prefixSum = prefixSum + a[i];
            if (prefixSum == sum) return true;
            if (h.contains(prefixSum - sum)) return true;
            h.add(prefixSum);
        }
        return false;
    }

}
