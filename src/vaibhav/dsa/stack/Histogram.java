package vaibhav.dsa.stack;

import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        int a[] = {6, 2, 5, 4, 1, 5, 6};
        System.out.println(naiveMethod(a));
        System.out.println(efficientSolution(a));
    }

    private static int efficientSolution(int[] a) {
        int n = a.length;
        int lb[] = new int[n];
        int rb[] = new int[n];

        lb[0] = -1;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                lb[i] = -1;
            } else {
                lb[i] = s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();
        rb[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                rb[i] = n;
            } else {
                rb[i] = s.peek();
            }
            s.push(i);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            int currentArea = (rb[i] - lb[i] - 1) * a[i];
            res = Math.max(res, currentArea);
        }

        return res;
    }

    private static int naiveMethod(int[] a) {
        int n = a.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int curr = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] >= a[i]) {
                    curr += a[i];
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (a[j] >= a[i]) {
                    curr += a[i];
                } else {
                    break;
                }
            }
            res = Math.max(curr, res);
        }
        return res;
    }
}
