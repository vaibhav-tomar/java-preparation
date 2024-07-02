package vaibhav.mysdesheet.array;

/**
 * @author vaibhav
 * created on 01-07-2024
 */
public class TrapRainWater {
    static long trappingWater(int arr[], int n) {
        // Your code here
        int[] maxOnRight = new int[n];
        int[] maxOnLeft = new int[n];
        maxOnRight[n - 1] = arr[n - 1];
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] <= max) {
                maxOnRight[i] = max;
            } else {
                max = arr[i];
            }
        }
        max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] <= max) {
                maxOnLeft[i] = max;
            } else {
                max = arr[i];
            }
        }
        long res = 0;
        for (int i = 1; i < n - 1; i++) {
            int level = Math.min(maxOnLeft[i], maxOnRight[i]);
            if (level > arr[i]) {
                res += level - arr[i];
            }
        }
        return res;
    }
}
