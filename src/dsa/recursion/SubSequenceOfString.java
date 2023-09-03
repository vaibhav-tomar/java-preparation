package dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceOfString {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(generateSubSequence(s));
        generateSubSequenceSolTwo(s, "", 0);
    }

    private static void generateSubSequenceSolTwo(String s, String curr, int i) {
        if (i == s.length()) {
            System.out.print(curr + " ");
            return;
        }
        generateSubSequenceSolTwo(s, curr, i + 1);
        generateSubSequenceSolTwo(s, curr + s.charAt(i), i + 1);
    }

    private static List<String> generateSubSequence(String s) {
        if (s.length() == 0) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        List<String> list = generateSubSequence(s.substring(1));
        char c = s.charAt(0);
        List<String> al = new ArrayList<>();
        for (String str : list) {
            al.add("" + str);
            al.add(c + str);
        }
        return al;
    }
}
