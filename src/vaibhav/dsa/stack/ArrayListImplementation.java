package vaibhav.dsa.stack;


import java.util.ArrayList;
import java.util.List;

public class ArrayListImplementation {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(15);
        s.push(25);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(35);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }


    static class MyStack {
        List<Integer> a;


        MyStack() {
            a = new ArrayList<>();
        }

        public int size() {
            return a.size();
        }

        public boolean isEmpty() {
            return a.isEmpty();
        }

        public void push(int x) {
            a.add(x);
        }

        public int pop() {
            return a.remove(a.size() - 1);

        }

        public int peek() {
            return a.get(a.size() - 1);
        }
    }

}


