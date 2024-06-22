package vaibhav.dsa.stack;

import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        String str = "{{}}{[]{}}}";
        checkBalanced(str);
    }

    private static boolean checkBalanced(String str) {
        char a[] = str.toCharArray();
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == '{' || a[i] == '[' || a[i] == '(') {
                s.push(a[i]);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                char c = s.pop();
                if ((a[i] == ')' && c != '(') || (a[i] == '}' && c != '{') || (a[i] == ']' && c != '[')) {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
