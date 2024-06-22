package vaibhav.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithGivenSum {

    public static void main(String[] args) {
        int a[] = {3, 1, 0, 1, 8, 2, 3, 6};
        int sum = 5;
        Map<Integer, Integer> h = new HashMap<>();
        int prefixSum = 0;
        int res = -1;
        for (int i = 0; i < a.length; i++) {
            prefixSum += a[i];
            if (prefixSum == sum) {
                res = Math.max(res, i + 1);
            }
            if (h.containsKey(prefixSum - sum)) {
                res = Math.max(res, i - h.get(prefixSum - sum));
            } else h.put(prefixSum, i);
        }
        System.out.println(res);
    }
}
