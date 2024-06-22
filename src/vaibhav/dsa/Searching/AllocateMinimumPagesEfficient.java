package vaibhav.dsa.Searching;

public class AllocateMinimumPagesEfficient {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        int k = 2;
        int res = minPages(a, k);
        System.out.println(res);
    }

    private static int minPages(int[] a, int k) {
        int n = a.length;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) max = a[i];
            sum += a[i];
        }

        int low = max;
        int high = sum;
        int res = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isFeasible(a, k, mid)) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    private static boolean isFeasible(int[] a, int k, int ans) {
        int n = a.length;
        int count = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + a[i] > ans) {
                count++;
                sum = a[i];
            } else {
                sum += a[i];

            }
        }
        return count <= k;
    }
}
