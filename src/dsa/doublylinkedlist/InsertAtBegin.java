package dsa.doublylinkedlist;

public class InsertAtBegin {
    private Node insertAtBegin(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            temp.next = null;
            temp.prev = null;
            return temp;
        }
        temp.next = head;
        head.prev = temp;
        temp.prev = null; // not required explicitly
        return temp;
    }
}
