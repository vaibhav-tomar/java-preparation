package vaibhav.dsa.strings;

public class AnagramSearch {
    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "frog";

        System.out.println(naiveSolution(text, pattern));
        System.out.println(efficientSolution(text, pattern));
    }

    private static boolean efficientSolution(String text, String pattern) {
        int countPattern[] = new int[256];
        int countText[] = new int[256];
        for (int i = 0; i < pattern.length(); i++) {
            countPattern[pattern.charAt(i)]++;
            countText[text.charAt(i)]++;
        }

        for (int i = pattern.length(); i < text.length(); i++) {
            if (areSame(countPattern, countText)) {
                return true;
            }
            countText[text.charAt(i)]++;
            countText[text.charAt(i - pattern.length())]--;
        }
        return false;
    }

    private static boolean areSame(int[] countPattern, int[] countText) {
        for (int i = 0; i < 256; i++) {
            if (countPattern[i] != countText[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean naiveSolution(String text, String pattern) {
        for (int i = 0; i < text.length(); i++) {
            if (isAnagram(text, pattern, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAnagram(String text, String pattern, int i) {
        int count[] = new int[256];
        for (int j = 0; j < pattern.length(); j++) {
            count[pattern.charAt(j)]++;
            count[text.charAt(i + j)]--;
        }

        for (int j = 0; j < 256; j++) {
            if (count[i] > 0) return false;
        }
        return true;
    }
}
