package dsa.stack;


public class LinkedListImplementation {
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

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class MyStack {
        Node head;
        int size;


        MyStack() {
            head = null;
            size = 0;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        public int pop() {
            size--;
            if (head == null) return Integer.MAX_VALUE;
            int data = head.data;
            head = head.next;
            return data;

        }

        public int peek() {
            if (head == null) return Integer.MAX_VALUE;
            return head.data;
        }
    }

}



