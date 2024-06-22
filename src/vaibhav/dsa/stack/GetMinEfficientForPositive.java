package vaibhav.dsa.stack;

import java.util.Stack;

public class GetMinEfficientForPositive {
    Stack<Integer> s = new Stack<>();
    int min;

    void push(int x) {

        if (s.isEmpty()) {
            min = x;
            s.add(x);
        } else if (x <= min) {
            s.add(x - min); //s.add(2*x-min);
            min = x;
        } else {
            s.add(x);
        }
    }

    int pop() {

        int t = s.peek();
        s.pop();
        if (t <= 0) {  //if(t<=min)
            int res = min;
            min = min - t; // min=2*min-t;
            return res;
        } else {
            return t;
        }
    }

    int peek() {
        int t = s.peek();
        return ((t <= 0) ? min : t); //return ((t<=min)? min : t);
    }

    int getMin() {
        return min;
    }
}
