package vaibhav.dsa.strings;

public class CheckSubSequence {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "gfks";

        boolean ans = efficient(s1, s2);
        System.out.println(ans);
    }

    private static boolean efficient(String s1, String s2) {
        int i = 0;
        int j = 0;

        int m = s1.length();
        int n = s2.length();

        while (i < m && j < n) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        if (j == n) return true;
        return false;
    }
}
