package dsa.Searching;

public class UnboundedBinarySearch {
    public static void main(String[] args) {
        int a[] = new int[1000000000]; // suppose this is an infinite array of millions size
        int x = 560;
        search(a, x);
    }

    private static int search(int[] a, int x) {
        if (a[0] == x) return 0;
        int i = 1;
        while (a[i] < x) {
            i = 2 * i;
        }
        if (a[i] == x) return i;
        return binarySearch(a, i / 2 + 1, i - 1, x);
    }

    private static int binarySearch(int[] a, int s, int e, int x) {
        while (s <= e) {
            int mid = (s + e) / 2;
            if (a[mid] == x) return mid;
            else if (a[mid] < x) s = mid + 1;
            else e = mid - 1;
        }
        return -1;
    }
}
