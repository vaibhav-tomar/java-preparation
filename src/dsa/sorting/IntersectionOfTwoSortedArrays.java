package dsa.sorting;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {3, 5, 10, 10, 10, 15, 15, 20};
        int b[] = {5, 10, 10, 15, 30};
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[i]) {
                j++;
            } else {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }

    }
}
