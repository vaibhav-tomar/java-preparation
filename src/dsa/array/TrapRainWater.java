package dsa.array;

public class TrapRainWater {
    public static void main(String[] args) {
        int a[] = {3, 0, 1, 2, 5};
        naiveSolution(a);
        efficientSol(a);


    }

    private static void efficientSol(int[] a) {
        int n = a.length;
        int res = 0;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        int l = Integer.MIN_VALUE;
        int r = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > l) {
                l = a[i];
            }
            lmax[i] = l;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > r) {
                r = a[i];
            }
            rmax[i] = r;
        }
        for (int i = 1; i < n - 1; i++) {
            res = res + Math.min(lmax[i], rmax[i]) - a[i];
        }
        System.out.println(res);

    }

    private static void naiveSolution(int[] a) {
        int n = a.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int lmax = a[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax, a[j]);
            }
            int rmax = a[i];
            for (int j = i + 1; j < n; j++) {
                rmax = Math.max(rmax, a[j]);
            }
            res = res + Math.min(lmax, rmax) - a[i];
        }
        System.out.println(res);
    }
}
