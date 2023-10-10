package dsa.strings;

public class NaivePatternSearch {
    public static void main(String[] args) {
        String text = "abababcdab";
        String pattern = "abab";

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            boolean found = true;
            for (int j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.println(i);
            }
        }
    }
}
