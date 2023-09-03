package dsa.circularlinkedlist;

public class DeleteHead {
    private Node deleteHead(Node head) {
        if (head == null || head.next == head) return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
}
