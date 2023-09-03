package dsa.strings;

public class SearchPattern {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        searchPattern(s, "geeks");
    }

    private static void searchPattern(String s, String pattern) {
        int i = 0;
        while (s.indexOf(pattern, i) != -1) {
            int index = s.indexOf(pattern, i);
            System.out.println(index);
            i = index + 1;
        }
    }
}
