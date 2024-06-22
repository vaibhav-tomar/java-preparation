package vaibhav.dsa.sorting;

public class CountInversions {
    public static void main(String[] args) {
        int a[] = {2, 4, 1, 3, 5};
        System.out.println(divide(a));
    }

    // three possibilities- the pair can lie on left, right, or on number on left and one on right;
    private static int divide(int[] a) {
        int n = a.length;
        if (n == 1) return 0;
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; i++) left[i] = a[i];
        for (int i = mid; i < n; i++) right[i - mid] = a[i];
        int leftInversion = divide(left);
        int rightInversion = divide(right);

        int leftRightInversion = mergeAndCount(a, left, right);

        return leftInversion + rightInversion + leftRightInversion;
    }

    private static int mergeAndCount(int[] a, int[] left, int[] right) {
        int m = left.length;
        int n = right.length;
        int i = 0, j = 0, k = 0;
        int res = 0;

        while (i < m && j < n) {
            if (left[i] <= right[j]) a[k++] = left[i++];
            else {
                a[k++] = right[j++];
                res = res + m - i;
            }
        }
        while (i < m) a[k++] = left[i++];
        while (j < n) a[k++] = right[j++];
        return res;
    }
}
