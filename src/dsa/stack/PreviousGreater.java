package dsa.stack;

import java.util.Stack;

public class PreviousGreater {
    public static void main(String[] args) {
        int a[] = {20, 30, 10, 5, 15};
        int n = a.length;
        Stack<Integer> s = new Stack<>();
        System.out.println(-1);
        s.add(a[0]);

        for (int i = 1; i < n; i++) {
            while (s.size() != 0 && s.peek() <= a[i]) {
                s.pop();
            }
            if (s.size() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(s.peek());
            }
            s.push(a[i]);
        }
    }
}
