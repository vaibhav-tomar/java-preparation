package dsa.array;

public class FrequencyInSortedArray {

    public static void main(String[] args) {
        int a[] = {10, 10, 10, 25, 30, 30, 40};
        int n = a.length;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                count++;
                if (i == n - 1) {
                    System.out.println(a[i] + " -> " + count);
                }
            } else {
                System.out.println(a[i - 1] + " -> " + count);
                count = 1;
                if (i == n - 1) {
                    System.out.println(a[i] + " -> " + count);
                }
            }
        }
    }
}
