package vaibhav.dsa.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {8, 4, 7, 9, 3, 10, 5};
        quickSort(a, 0, a.length - 1);
        for (int x : a) System.out.print(x + " ");
    }

    private static void quickSort(int[] a, int l, int h) {
        if (l >= h) return; // if 0 or 1 element, don't do anything
        if (l < h) {
            int p = partition(a, l, h);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, h);
        }
    }

    private static int partition(int[] a, int l, int h) {
        int n = a.length;
        int pivot = a[h];
        int index = l;
        for (int i = l; i <= h - 1; i++) {
            if (a[i] < pivot) {
                a[index] = a[index] + a[i] - (a[i] = a[index]);
                index++;
            }
        }
        a[index] = a[index] + a[h] - (a[h] = a[index]);
        return index;
    }
}
