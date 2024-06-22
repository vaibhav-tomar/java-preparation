package vaibhav.dsa.Searching;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        int a[] = {5, 10, 10, 20, 20};
        int x = 20;
        indexOfFirstOccurrence(a, x);
    }

    private static int indexOfFirstOccurrence(int[] a, int x) {
        int n = a.length;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (a[mid] > x) {
                e = mid - 1;
            } else if (a[mid] < x) {
                s = mid + 1;
            } else {
                if (mid == 0 || a[mid] != a[mid - 1]) {
                    return mid;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
