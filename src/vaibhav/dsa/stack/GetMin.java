package vaibhav.dsa.stack;

import java.util.Stack;

public class GetMin {
    Stack<Integer> ms = new Stack<>();
    Stack<Integer> as = new Stack<>();

    void push(int x) {

        if (ms.isEmpty()) {
            ms.add(x);
            as.add(x);
            return;
        }

        ms.add(x);

        if (ms.peek() <= as.peek())
            as.add(x);
    }

    void pop() {

        if (as.peek() == ms.peek())
            as.pop();
        ms.pop();

    }

    int top() {
        return ms.peek();
    }

    int getMin() {
        return as.peek();
    }

}
