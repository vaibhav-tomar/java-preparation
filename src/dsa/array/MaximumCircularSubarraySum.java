package dsa.array;

public class MaximumCircularSubarraySum {
    public static void main(String[] args) {
        int a[] = {8, -4, 3, -5, 4};
        naiveMethod(a);
        System.out.println(efficientMethod(a));
    }

    private static int efficientMethod(int[] a) {
        int n = a.length;
        int normalMax = normalMax(a);
        if (normalMax < 0) return normalMax;// this is important
        int circularMax = circularmax(a);

        return Math.max(normalMax, circularMax);
    }

    private static int circularmax(int[] a) {
        int n = a.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += a[i];
            a[i] = -a[i];
        }

        return totalSum + normalMax(a);
    }

    private static int normalMax(int[] a) {
        int n = a.length;
        int res = a[0];
        int maxEnd = a[0];
        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(a[i], maxEnd + a[i]);
            res = Math.max(res, maxEnd);
        }
        return res;
    }

    private static void naiveMethod(int[] a) {
        int n = a.length;
        int res = a[0];
        for (int i = 0; i < n; i++) {
            int curr_max = a[i];
            int curr_sum = a[i];
            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;
                curr_sum += a[index];
                curr_max = Math.max(curr_sum, curr_max);
            }
            res = Math.max(curr_max, res);
        }
        System.out.println(res);
    }
}
