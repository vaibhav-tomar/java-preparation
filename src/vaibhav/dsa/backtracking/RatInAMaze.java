package vaibhav.dsa.backtracking;

import java.util.ArrayList;

public class RatInAMaze {
    public static void main(String[] args) {
        int n = 5;
        int m[][] = new int[n][n];

        findPaths(m, 1, 1, n, n);
    }

    static ArrayList<String> findPaths(int[][] m, int sr, int sc, int dr, int dc) {
        if (m[sr - 1][sc - 1] == 0 || m[sr - 1][sc - 1] == -1) {
            return new ArrayList<>();
        }
        if (sr == dr && sc == dc) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        ArrayList<String> u = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();
        ArrayList<String> l = new ArrayList<>();
        ArrayList<String> r = new ArrayList<>();

        m[sr - 1][sc - 1] = -1;
        if (sr > 1) u = findPaths(m, sr - 1, sc, dr, dc);
        if (sr < dr) d = findPaths(m, sr + 1, sc, dr, dc);
        if (sc > 1) l = findPaths(m, sr, sc - 1, dr, dc);
        if (sc < dc) r = findPaths(m, sr, sc + 1, dr, dc);
        m[sr - 1][sc - 1] = 1;

        ArrayList<String> res = new ArrayList<>();
        for (String s : d) {
            res.add("D" + s);
        }
        for (String s : l) {
            res.add("L" + s);
        }
        for (String s : r) {
            res.add("R" + s);
        }
        for (String s : u) {
            res.add("U" + s);
        }
        return res;
    }
}
