package vaibhav.dsa.Searching;

public class PeakElement {
    public static void main(String[] args) {
        int a[] = {1, 2, 40, 30, 20, 50, 60};
        int res = findPeak(a);
        System.out.println(res);
    }

    private static int findPeak(int[] a) {
        int s = 0;
        int e = a.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if ((mid == 0 || a[mid - 1] <= a[mid]) && (mid == a.length - 1 || a[mid + 1] <= a[mid])) {
                return mid;
            }
            if (mid > 0 && a[mid - 1] >= a[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
