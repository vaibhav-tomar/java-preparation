package vaibhav.dsa.strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abcbaa";

        naiveMethod(s);
        efficient(s);
    }

    private static boolean naiveMethod(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return s.equals(str.toString());
    }

    private static void efficient(String s) {
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
