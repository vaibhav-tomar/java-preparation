package vaibhav.dsa.sorting;


public class KthSmallestElement {
    public static void main(String[] args) {
        int a[] = {10, 5, 30, 12};
        int k = 2;
        int index = kthSmallest(a, 0, a.length - 1, k);
        if (index == -1) System.out.println("not found");
        else System.out.println(a[index]);
    }

    private static int kthSmallest(int[] a, int l, int h, int k) {
        while (l <= h) {
            int p = partition(a, l, h);
            if (k - 1 == p) {
                return p;
            } else if (p > k - 1) h = p - 1;
            else l = p + 1;
        }
        return -1;
    }

    private static int partition(int[] a, int l, int h) {
        int pivot = a[h];
        int index = l;
        for (int i = l; i < h; i++) {
            if (a[i] < pivot) {
                a[index] = a[index] + a[i] - (a[i] = a[index]);
                index++;
            }
        }
        a[h] = a[h] + a[index] - (a[index] = a[h]);
        return index;
    }
}
