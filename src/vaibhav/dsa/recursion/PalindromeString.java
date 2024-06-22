package vaibhav.dsa.recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "abcdvbdcba";
        System.out.println(checkPalindrome(s, 0, s.length() - 1));
    }

    private static boolean checkPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        return (str.charAt(start) == str.charAt(end)) && checkPalindrome(str, start + 1, end - 1);
    }
}
