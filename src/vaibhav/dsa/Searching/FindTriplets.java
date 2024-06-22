package vaibhav.dsa.Searching;

public class FindTriplets {
    public static void main(String[] args) {
        int a[] = {2, 4, 8, 9, 11, 12, 20, 30};
        int x = 25;
        boolean ans = findTriplet(a, x);
        System.out.println(ans);
    }

    // if you are given unsorted array then also time complexity will be O(n^2)
    // because we can sort the given array first in O(nlogn)
    private static boolean findTriplet(int[] a, int x) {
        for (int i = 0; i < a.length - 2; i++) {
            if (findPair(a, x - a[i], i + 1)) return true;
        }
        return false;
    }

    private static boolean findPair(int[] a, int x, int s) {
        int i = s;
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
