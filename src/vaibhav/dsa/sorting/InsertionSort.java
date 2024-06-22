package vaibhav.dsa.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {20, 5, 40, 60, 10, 30};
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        for (int x : a) {
            System.out.println(x);
        }
    }
}
