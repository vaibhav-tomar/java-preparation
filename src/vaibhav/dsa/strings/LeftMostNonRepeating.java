package vaibhav.dsa.strings;

import java.util.Arrays;

public class LeftMostNonRepeating {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(solOne(s));
        System.out.println(efficientSol(s));
    }

    private static int efficientSol(String s) {
        int index[] = new int[256];
        Arrays.fill(index, -1);
        for (int i = 0; i < s.length(); i++) {
            if (index[s.charAt(i)] == -1) {
                index[s.charAt(i)] = i;
            } else {
                index[s.charAt(i)] = -2;
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (index[i] >= 0) {
                res = Math.min(res, index[i]);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private static int solOne(String s) {

        int freq[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
