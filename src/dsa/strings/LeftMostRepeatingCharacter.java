package dsa.strings;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abbcc";
        int ans = findRepeating(s);
        int res = bestApproach(s);
        int result = bestApproachTwo(s);
        System.out.println(ans);
        System.out.println(res);
        System.out.println(result);

    }

    private static int bestApproachTwo(String s) {
        int res = -1;
        boolean visited[] = new boolean[256];
        for (int i = s.length() - 1; i >= 0; i--) {
            if (visited[s.charAt(i)]) {
                res = i;
            } else {
                visited[s.charAt(i)] = true;
            }
        }
        return res;

    }

    private static int bestApproach(String s) {
        int firstIndex[] = new int[256];
        Arrays.fill(firstIndex, -1);

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int fi = firstIndex[s.charAt(i)];
            if (fi == -1) {
                firstIndex[s.charAt(i)] = i;
            } else {
                res = Math.min(res, fi);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private static int findRepeating(String s) {
        int freq[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] > 1) return i;
        }
        return -1;
    }
}
