package dsa.sorting;

public class SegregateTwoTypes {
    public static void main(String[] args) {
        int a[] = {15, -3, -2, 18};
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[index] = a[index] + a[i] - (a[i] = a[index]);
                index++;
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
