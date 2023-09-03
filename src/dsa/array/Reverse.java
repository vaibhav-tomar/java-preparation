package dsa.array;

public class Reverse {
    public static void main(String[] args) {
        int a[] = {3, 5, 1, 2, 9, 7};
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            a[start] = a[start] + a[end] - (a[end] = a[start]);
            start++;
            end--;
        }
        for (int x : a) {
            System.out.println(x);
        }
    }
}
