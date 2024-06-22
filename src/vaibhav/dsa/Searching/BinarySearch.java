package vaibhav.dsa.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60};
        int x = 30;
        System.out.println(binarySearch(a, x));
    }

    private static int binarySearch(int[] a, int x) {
        int n = a.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == a[mid]) return mid;
            else if (x > a[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
