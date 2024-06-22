package vaibhav.dsa.strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "my name is vaibhav";

        naiveSolution(s);
        efficientSolution(s.toCharArray());
    }

    private static void efficientSolution(char[] s) {
        int start = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                reverse(s, start, i - 1);
                start = i + 1;
            }
        }
        reverse(s, start, s.length - 1);
        reverse(s, 0, s.length - 1);

        System.out.println(new String(s));

    }

    private static void reverse(char[] s, int start, int end) {
        while (start < end) {
            s[start] = (char) (s[start] + s[end] - (s[end] = s[start]));
            start++;
            end--;
        }
    }

    private static void naiveSolution(String s) {
        String str[] = s.split(" ");
        String res = "";
        for (int i = str.length - 1; i >= 0; i--) {
            res = res + str[i] + " ";
        }

        System.out.println(res);
    }
}
