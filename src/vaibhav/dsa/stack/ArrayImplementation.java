package vaibhav.dsa.stack;

public class ArrayImplementation {
    public static void main(String[] args) {
        MyStack s = new MyStack(10);
        s.push(5);
        s.push(15);
        s.push(25);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(35);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }

}

class MyStack {
    int capacity;
    int a[];
    int top;


    MyStack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.a = new int[capacity];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int x) {
        top = top + 1;
        a[top] = x;
    }

    public int pop() {
        int value = a[top];
        top = top - 1;
        return value;

    }

    public int peek() {
        return a[top];
    }
}