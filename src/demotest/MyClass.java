package demotest;

/**
 * @author vaibhav
 * created on 27-06-2024
 */
public class MyClass {
    public static void main(String[] args) {
        int a[] = {4, 1, 8, 10, 3, 5, 7, 9, 23, 2, 0};
        int pivot = 5;
        int n = a.length;
        int start = 0;
        int mid = 0;
        int high = n - 1;
        int countOfSwaps = 0;
        while (mid < high) {
            for (int x : a) {
                System.out.print(x + "  ");
            }
            System.out.println();
            System.out.println(a[mid] + "  " + a[high]);
            System.out.println();
            if (a[mid] > pivot && a[high] > pivot) {
                mid++;
            }
            if (a[mid] < pivot) {
                a[start] = a[start] + a[mid] - (a[mid] = a[start]);
                start++;
                mid++;
            } else if (a[mid] == pivot) {
                mid++;
            } else {
                a[mid] = a[mid] + a[high] - (a[high] = a[mid]);
                high--;
                mid++;
                countOfSwaps++;
            }
        }
        System.out.println(countOfSwaps);
    }
}
