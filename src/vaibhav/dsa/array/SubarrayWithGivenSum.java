package vaibhav.dsa.array;

import java.util.HashSet;

public class SubarrayWithGivenSum {

    // array has only non negative elements
    public static void main(String[] args) {
        int a[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        prefixMethod(a, sum);
        System.out.println(slidingWindowMethod(a, sum));
    }

    private static boolean slidingWindowMethod(int[] a, int sum) {
        int n = a.length;
        int s = 0;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += a[i];
            while (currSum > sum) {
                currSum = currSum - a[s];
                s++;
            }
            if (currSum == sum) return true;
        }
        return false;

    }

    private static void prefixMethod(int[] a, int sum) {
        int n = a.length;
        HashSet<Integer> h = new HashSet<>();

        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += a[i];
            if (prefixSum == sum) {
                System.out.println("yes");
                break;
            }
            if (h.contains(prefixSum - sum)) {
                System.out.println("yes");
                break;
            }
            h.add(prefixSum);
        }
    }
}
