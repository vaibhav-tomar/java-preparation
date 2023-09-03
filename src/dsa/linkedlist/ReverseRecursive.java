package dsa.linkedlist;

public class ReverseRecursive {
    private Node reverseMethodOne(Node head) {
        if (head == null) return null;
        if (head.next == null) return head;
        Node newHead = reverseMethodOne(head.next);
        Node newTail = head.next;
        newTail.next = head;
        head.next = null;
        return newHead;
    }
}
