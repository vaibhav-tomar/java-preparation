package dsa.array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int a[] = {3, 5, 0, 1, 0, 2, 9, 7};
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[i] = a[i] + a[index] - (a[index] = a[i]);
                index++;
            }
        }
        for (int x : a) System.out.println(x);
    }
}
