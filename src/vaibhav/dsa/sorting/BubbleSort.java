package vaibhav.dsa.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {10, 8, 20, 5};
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] + a[j + 1] - (a[j + 1] = a[j]);
                }
            }
        }
        for (int x : a) {
            System.out.println(x);
        }
    }
}
