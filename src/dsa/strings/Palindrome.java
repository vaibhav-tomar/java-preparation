package dsa.strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abcbaa";
        int i = 0;
        int j = s.length() - 1;
        boolean isPalindrome = true;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }

}
