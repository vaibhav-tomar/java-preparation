package dsa.strings;

public class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "aabbccde";
        String s2 = "ebabacdc";

        boolean ans = efficient(s1, s2);
        System.out.println(ans);
    }

    private static boolean efficient(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int freq[] = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }
}
