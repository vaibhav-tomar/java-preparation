package vaibhav.dsa.strings;

import java.util.Arrays;

public class LongestDistinctCharacters {
    public static void main(String[] args) {
        String s = "abcadbba";
        System.out.println(naiveSol(s));
        System.out.println(efficientSol(s));
    }

    private static int efficientSol(String s) {
        int n = s.length();
        int prev[] = new int[256];
        Arrays.fill(prev, -1);

        int res = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(i, prev[s.charAt(j)] + 1);
            int maxEnd = j - i + 1;
            res = Math.max(res, maxEnd);
            prev[s.charAt(j)] = j;
        }
        return res;
    }

    private static int naiveSol(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            boolean visited[] = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visited[s.charAt(j)] == true) {
                    break;
                } else {
                    visited[s.charAt(j)] = true;
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }
}
