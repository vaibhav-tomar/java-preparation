package vaibhav.dsa.array;

public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {3, 5, 1, 2, 9, 7, 9, 7};
        int max = a[0];
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secMax = max;
                max = a[i];
            } else if (a[i] > secMax && a[i] != max) {
                secMax = a[i];
            }
        }
        System.out.println(secMax);
    }
}
