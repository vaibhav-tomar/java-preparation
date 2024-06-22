package vaibhav.dsa.linkedlist;

public class InsertAtEnd {

    private Node insertAtEnd(Node head, int x) {
        if (head == null) return new Node(x);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(x);
        return head;
    }
}
