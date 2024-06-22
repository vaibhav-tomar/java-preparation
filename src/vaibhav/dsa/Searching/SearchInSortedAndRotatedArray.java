package vaibhav.dsa.Searching;

public class SearchInSortedAndRotatedArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 40, 60, 5, 8};
        int x = 5;
        int res = searchInSortedRotated(a, x);
        System.out.println(res);
    }

    private static int searchInSortedRotated(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == x) return mid;
            if (a[low] <= a[mid]) {
                if (x >= a[low] && x < a[mid]) {
                    mid = high - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (x > a[mid] && x <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
