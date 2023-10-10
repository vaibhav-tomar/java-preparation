package dsa.strings;

public class PrintLexicographicString {
    public static void main(String[] args) {
        String s = "zz";
        for (char c = 'a'; c <= 'z'; c++) {
            dfs(String.valueOf(c), s);
        }
    }

    private static void dfs(String i, String s) {

        if (i.length() > s.length()) return;

        System.out.println(i);
        for (char c = 'a'; c <= 'z'; c++) {
            dfs(i.concat(String.valueOf(c)), s);
        }
    }
}
