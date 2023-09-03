package dsa.circularlinkedlist;

public class CircularLinkedList {

    private void traverseMethodOne(Node head) {
        if (head == null) return;
        System.out.println(head.data);
        Node curr = head.next;
        while (curr != head) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    private void traverseMethodTwo(Node head) {
        if (head == null) return;
        Node curr = head.next;
        do {
            System.out.println(curr.data);
            curr = curr.next;
        }
        while (curr != head);
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
