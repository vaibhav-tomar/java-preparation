package dsa.doublylinkedlist;

public class DeleteLast {
    private Node deleteLast(Node head) {
        if (head == null || head.next == null) return null;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }
}
