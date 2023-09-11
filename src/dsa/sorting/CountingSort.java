package dsa.sorting;

public class CountingSort {
    public static void main(String[] args) {
        int a[] = {1, 4, 4, 1, 0, 1};
        int n = a.length;
        int k = 5;
        int count[] = new int[k];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 1; i < k; i++) {
            count[i] = count[i] + count[i - 1];
        }
        int output[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }
        for (int i = 0; i < n; i++) {
            a[i] = output[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
