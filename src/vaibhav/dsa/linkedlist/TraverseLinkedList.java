package vaibhav.dsa.linkedlist;

public class TraverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(40);
        head.next = new Node(10);
        head.next.next = new Node(30);
        head.next.next.next = new Node(5);

        printElements(head);
        printElementsRecursion(head);
    }

    private static void printElementsRecursion(Node head) {

        if (head == null) return;
        System.out.print(head.data + " ");
        printElementsRecursion(head.next);
    }

    private static void printElements(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
