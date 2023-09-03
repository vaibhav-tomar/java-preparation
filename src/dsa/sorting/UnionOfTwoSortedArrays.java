package dsa.sorting;

public class UnionOfTwoSortedArrays {
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
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.println(a[i]);
                i++;
            } else if (b[j] < a[i]) {
                System.out.println(b[j]);
                j++;
            } else {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
        while (i < m) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            System.out.println(a[i++]);
        }
        while (j < n) {
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            System.out.println(b[j++]);
        }
    }
}
