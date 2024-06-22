package vaibhav.dsa.linkedlist;

public class NthNodeFromEnd {

    private void method1(Node head, int n) {
        int length = 0;
        for (Node curr = head; curr != null; curr = curr.next) {
            length++;
        }
        if (n > length) return;
        Node curr = head;
        for (int i = 0; i < length - n + 1; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    private void efficientSolution(Node head, int n) {
        if (head == null) return;
        Node first = head;
        for (int i = 0; i < n; i++) {
            if (first == null) return; // if n > size of linked list
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        System.out.println(second.data);
    }
}
