package vaibhav.dsa.strings;

public class CheckIfRotations {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        System.out.println(areRotations(s1, s2));
    }

    private static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return (s1 + s1).indexOf(s2) >= 0;
    }
}
