package vaibhav.mysdesheet.array;

/**
 * @author vaibhav
 * created on 01-07-2024
 */
public class Kadanes {
    long maxSubarraySum(int[] arr) {

        // Your code here
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            res = Math.max(currSum, res);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return res;
    }
}
