package dsa.Searching;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 26;
        getSquareRoot(x);
    }

    private static int getSquareRoot(int x) {
        int s = 1;
        int e = x;
        int res = -1;
        while (s <= e) {
            int mid = (s + e) / 2;
            int mySquare = mid * mid;
            if (mySquare == x) return mid;
            else if (mySquare > x) {
                e = mid - 1;
            } else {
                res = mid;
                s = mid + 1;
            }
        }
        return res;
    }
}
