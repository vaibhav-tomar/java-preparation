package vaibhav.dsa.strings;

/**
 * Overall time complexity is O(n) of this algorithm as the outer loop
 * also moves x times if inner loop moves x times
 */
public class ImprovedNaiveSearchForDistinct {
    public static void main(String[] args) {
        String text = "abcabcd";
        String pattern = "abcd";

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i < n; ) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println(i);
            }
            if (j == 0) {
                i = i++;
            } else {
                i = i + j;
            }
        }
    }
}
