package vaibhav.dsa.Searching;

public class MedianOfTwoSortedArrays {

    //efficient Solution
    // assuming first array size is smaller than second
    // if second array is bigger, swap the references


//    mid1 -> number of elements picked from first array starting from first element
//    mid2 -> number of elements picked from second array starting from first element

    public static void main(String[] args) {
        int a[] = {1, 3, 4, 7, 10, 12};
        int b[] = {2, 3, 6, 15};
//        int a[] = {2,9,10};
//        int b[] = {1,3,5};

        double ans = median(a, b);
        System.out.println(ans);
    }

    private static double median(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        if (n1 > n2) return median(b, a);
        int left = (n1 + n2 + 1) / 2;
        int n = n1 + n2;
        int low = 0;
        int high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if (mid1 != n1) r1 = a[mid1];
            if (mid2 != n2) r2 = b[mid2];
            if (mid1 != 0) l1 = a[mid1 - 1];
            if (mid2 != 0) l2 = b[mid2 - 1];

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 0) {
                    return (double) ((Math.max(l1, l2) + Math.min(r1, r2)) / 2);
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return 0;
    }
}
