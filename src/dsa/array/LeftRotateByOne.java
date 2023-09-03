package dsa.array;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int a[] = {3, 5, 1, 2, 9, 7};
        int temp = a[0];
        int n = a.length;
        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        a[n - 1] = temp;
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
