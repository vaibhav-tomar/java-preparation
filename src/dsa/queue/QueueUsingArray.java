package dsa.queue;

public class QueueUsingArray {

}

class MyQueue {
    int size;
    int cap, front, rear;
    int a[];

    MyQueue(int cap) {
        this.a = new int[cap];
        this.size = 0;
        this.cap = cap;
        front = 0;
        rear = 0;
    }

    private void enqueue(int x) {
        if (size == cap) return;
        rear = getRearIndex();
        rear = (rear + 1) % cap;
        a[rear] = x;
        size++;
    }

    private int getRearIndex() {
        return (front + size - 1) % cap;
    }

    private int dequeue() {
        if (size == 0) return -1;
        int data = a[front];
        front = (front + 1) % cap;
        return data;
    }

    int getFront() {
        if (isEmpty()) return -1;
        return a[front];
    }

    int getRear() {
        if (isEmpty()) return -1;
        return a[getRearIndex()];
    }

    boolean isFull() {
        return size == cap;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }
}
