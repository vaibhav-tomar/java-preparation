package vaibhav.dsa.recursion;

public class PermutationsOfString {

    public static void main(String[] args) {
        String s = "abc";
        permutations(s, "");
    }

    private static void permutations(String s, String ans) {
        if (s.length() == 0) System.out.println(ans);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            permutations(s.substring(0, i) + s.substring(i + 1), ans + c);
        }
    }

}
