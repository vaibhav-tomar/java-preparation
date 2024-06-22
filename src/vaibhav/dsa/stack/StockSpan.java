package vaibhav.dsa.stack;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int a[] = {60, 10, 20, 15, 35, 50};
        int n = a.length;
        System.out.println(1);
        Stack<Integer> s = new Stack<>();
        s.push(0);

        for (int i = 1; i < n; i++) {
            while (s.isEmpty() == false && a[s.peek()] <= a[i]) {
                s.pop();
            }
            if (s.isEmpty() == true) {
                System.out.println(i + 1);
            } else {
                System.out.println(i - s.peek());
            }
            s.push(i);
        }
    }
}
