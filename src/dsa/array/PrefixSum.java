package dsa.array;

public class PrefixSum {
    public static void main(String[] args) {
        int a[] = {2, 8, 3, 9, 6, 5, 4};
        getSum(a, 1, 3);
        System.out.println(getWeightedSum(a, 2, 3));

    }

    private static int getWeightedSum(int[] a, int l, int r) {
        a = new int[]{2, 3, 5, 4, 6, 1};
        int n = a.length;
        int[] weightedPrefix = new int[n];
        weightedPrefix[0] = a[0];
        for (int i = 1; i < n; i++) {
            weightedPrefix[i] = (i + 1) * a[i] + weightedPrefix[i - 1];
        }
        if (l == 0) return weightedPrefix[r];
        else {
            return weightedPrefix[r] - weightedPrefix[l - 1] - l * getSum(a, l, r);
        }

    }

    private static int getSum(int[] a, int l, int r) {
        int n = a.length;
        int[] prefix = new int[n];
        prefix[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        if (l == 0) return prefix[r];
        else return prefix[r] - prefix[l - 1];
    }
}
