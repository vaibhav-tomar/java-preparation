package vaibhav.dsa.linkedlist;

public class DeleteFirstNode {
    private Node deleeFirstNode(Node head) {
        if (head == null) return null;
        return head.next;
    }
}
