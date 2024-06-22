package vaibhav.dsa.stack;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int a[] = {5, 15, 10, 8, 6, 12, 9, 18};
        int n = a.length;
        int ans[] = new int[n];
        ans[n - 1] = -1;
        Stack<Integer> s = new Stack<>();
        s.add(a[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (s.size() != 0 && s.peek() <= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }
            s.push(a[i]);
        }
        for (int x : ans) {
            System.out.print(x + " ");
        }

    }
}
