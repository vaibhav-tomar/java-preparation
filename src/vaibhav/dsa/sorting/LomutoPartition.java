package vaibhav.dsa.sorting;

public class
LomutoPartition {
    public static void main(String[] args) {
        int a[] = {10, 80, 30, 30, 90, 40, 50, 70, 70};
        int n = a.length;
        int pivot = a[n - 1]; // make last element as pivot. If pivot is given some other element then swap it with last element and take pivot to last of array and then start question
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < pivot) {
                a[i] = a[i] + a[index] - (a[index] = a[i]);
                index++;
            }
        }
        a[index] = a[index] + a[n - 1] - (a[n - 1] = a[index]);
        for (int x : a) System.out.print(x + " ");
    }
}
