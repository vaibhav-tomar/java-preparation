package vaibhav.dsa.sorting;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {10, 15, 20};
        int b[] = {5, 6, 6, 15};
        int m = a.length;
        int n = b.length;
        int c[] = new int[m + n];
        int i = 0, j = 0, index = 0;
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                c[index++] = a[i++];
            } else {
                c[index++] = b[j++];
            }
        }
        while (i < m) {
            c[index++] = a[i++];
        }
        while (j < n) {
            c[index++] = b[j++];
        }

        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
