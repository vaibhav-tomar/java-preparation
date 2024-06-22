package demotest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vaibhav
 * created on 19-06-2024
 */
public class Main {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4, 5};
        int target = 11;

        int n = a.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            prefixSum += a[i];
            if (map.containsKey(prefixSum - target)) {
                Integer index = map.get(prefixSum - target);
                int currentSubArrayLength = i - (index + 1) + 1;
                minLength = Math.min(currentSubArrayLength, minLength);
            } else if (prefixSum - target > 0) {
                int currentSubArrayLength = i + 1;
                minLength = Math.min(currentSubArrayLength, minLength);
            }
            map.put(prefixSum, i);
        }
        System.out.println(minLength == Integer.MAX_VALUE ? 0 : minLength);
    }
}
