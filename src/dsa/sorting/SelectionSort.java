package dsa.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {10, 5, 8, 20, 2, 18};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            a[i] = a[i] + a[minIndex] - (a[minIndex] = a[i]);
        }
        for (int x : a) {
            System.out.println(x);
        }
    }
}
