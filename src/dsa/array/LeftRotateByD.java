package dsa.array;

public class LeftRotateByD {
    public static void main(String[] args) {
        int a[] = {3, 5, 1, 2, 9, 7};
        int d = 2;
        // we can also call lefRotateByOne d times
//        leftRotateByD(a, d);
        bestSolution(a, d);
    }

    private static void bestSolution(int[] a, int d) {
        int n = a.length;
        reverse(a, 0, d - 1);
        reverse(a, d, n - 1);
        reverse(a, 0, n - 1);
        print(a);
    }

    private static void reverse(int[] a, int start, int end) {
        while (start < end) {
            a[start] = a[start] + a[end] - (a[end] = a[start]);
            start++;
            end--;
        }
    }

    private static void leftRotateByD(int[] a, int d) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];
        }
        for (int i = d; i < a.length; i++) {
            a[i - d] = a[i];
        }
        for (int i = 0; i < temp.length; i++) {
            a[a.length - d + i] = temp[i];
        }

//        print(a);
    }

    private static void print(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
