package vaibhav.dsa.recursion;

public class RopeCut {
    public static void main(String[] args) {
        int n = 9;
        int a = 2, b = 2, c = 2;
        System.out.println(cutTheRope(n, a, b, c, 0));
        System.out.println(cutTheRope(n, a, b, c));
    }

    private static int cutTheRope(int n, int a, int b, int c) {
        if (n == 0) return 0;
        if (n < 0) return -1;
        int x = cutTheRope(n - a, a, b, c);
        int y = cutTheRope(n - b, a, b, c);
        int z = cutTheRope(n - c, a, b, c);
        int res = Math.max(x, Math.max(y, z));
        if (res == -1) return -1;
        return res + 1;
    }

    private static int cutTheRope(int n, int a, int b, int c, int pieces) {
        if (n == 0) return pieces;
        if (n < 0) return -1;
        int x = cutTheRope(n - a, a, b, c, pieces + 1);
        int y = cutTheRope(n - b, a, b, c, pieces + 1);
        int z = cutTheRope(n - c, a, b, c, pieces + 1);
        return Math.max(x, Math.max(y, z));
    }
}
