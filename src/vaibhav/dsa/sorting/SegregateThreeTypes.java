package vaibhav.dsa.sorting;

public class SegregateThreeTypes {
    public static void main(String[] args) {
        int a[] = {0, 1, 1, 2, 0, 1};
        int low = 0, high = a.length - 1, mid = 0;
        while (mid <= high) {
            if (a[mid] < 1) {
                a[low] = a[low] + a[mid] - (a[mid] = a[low]);
                low++;
                mid++;
            } else if (a[mid] > 1) {
                a[mid] = a[mid] + a[high] - (a[high] = a[mid]);
                high--;
            } else {
                mid++;
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
