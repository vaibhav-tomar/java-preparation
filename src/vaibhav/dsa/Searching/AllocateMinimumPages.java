package vaibhav.dsa.Searching;


// we need to minimize the maximum number of pages read by any student
public class AllocateMinimumPages {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int n = a.length;
        int k = 2;

        //TODO  this solution is not working properly, need correction
        System.out.println(naiveSolution(a, n, k));
    }

    private static int naiveSolution(int[] a, int n, int k) {
        return minPages(a, n, k);
    }

    private static int minPages(int[] a, int n, int k) {
        if (n == 1) return a[0];
        if (k == 1) return sum(a, 0, n - 1);
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= n - 1; i++) {
            int rightAns = minPages(a, n - i, k - 1);
            int sum = sum(a, 0, i - 1);
            res = Math.min(res, Math.max(rightAns, sum));
        }
        return res;
    }

    private static int sum(int a[], int s, int e) {

        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum += a[i];
        }
        return sum;
    }

}
