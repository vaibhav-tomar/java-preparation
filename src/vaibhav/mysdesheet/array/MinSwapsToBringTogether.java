package vaibhav.mysdesheet.array;

/**
 * @author vaibhav
 * created on 03-07-2024
 */
public class MinSwapsToBringTogether {
    public static int minSwap(int arr[], int n, int k) {
        //Complete the function
        int window = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) window++;
        }
        int swaps = 0;
        for (int i = 0; i < window; i++) {
            if (arr[i] > k) swaps++;
        }
        int res = swaps;
        int i = 0;
        int j = window;
        while (j < n) {
            if (arr[i] > k) swaps--;
            if (arr[j] > k) swaps++;
            res = Math.min(res, swaps);
            i++; j++;
        }
        return res;
    }
}
