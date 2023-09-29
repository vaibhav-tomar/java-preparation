package dsa.Searching;

public class TwoPointer {
    public static void main(String[] args) {
        int a[] = {2, 4, 8, 9, 11, 12, 20, 30};
        int x = 25;
        boolean res = findPair(a, x);
        System.out.println(res);
    }

    private static boolean findPair(int[] a, int x) {
        int i = 0;
        int n = a.length;
        int j = n - 1;
        while (i < j) {
            if (a[i] + a[j] == x) return true;
            if (a[i] + a[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
