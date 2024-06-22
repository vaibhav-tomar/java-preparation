package vaibhav.dsa.doublylinkedlist;

public class DeleteHead {
    private Node deleteHead(Node head) {
        if (head == null || head.next == null) return null;
        head = head.next;
        head.prev = null;
        return head;
    }
}
