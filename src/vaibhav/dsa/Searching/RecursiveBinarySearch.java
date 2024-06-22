package vaibhav.dsa.Searching;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60};
        int x = 30;
        System.out.println(recursiveBinarySearch(a, x, 0, a.length - 1));
    }

    private static int recursiveBinarySearch(int[] a, int x, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (x == a[mid]) return mid;
        else if (x > a[mid]) start = mid + 1;
        else end = mid - 1;
        return recursiveBinarySearch(a, x, start, end);
    }
}
