package dsa.circularlinkedlist;

public class InsertAtEnd {
    private Node insertAtEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        head.data = head.data + temp.data - (temp.data = head.data);
        return temp; // temp is the new head
    }
}
