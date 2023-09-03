package dsa.linkedlist;

public class InsertAtGivenPosition {
    private Node insertAtPosition(Node head, int pos, int data) {
        if (pos == 1) {
            Node temp = new Node(data);
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i <= pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) return head;
        Node temp = new Node(data);
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
}
