package vaibhav.dsa.queue;

public class QueueUsingLinkedList {

    static class MyQueue {
        QueueNode front, rear;

        //Function to push an element into the queue.
        void push(int a) {
            // Your code here
            QueueNode temp = new QueueNode(a);
            if (rear == null || front == null) {
                rear = temp;
                front = temp;
            } else {
                rear.next = temp;
                rear = temp;
            }

        }

        //Function to pop front element from the queue.
        int pop() {
            // Your code here
            if (front == null) return -1;
            int data = front.data;
            front = front.next;
            if (front == null) rear = null;
            return data;
        }
    }

    static class QueueNode {
        int data;
        QueueNode next;

        QueueNode(int a) {
            data = a;
            next = null;
        }
    }
}
