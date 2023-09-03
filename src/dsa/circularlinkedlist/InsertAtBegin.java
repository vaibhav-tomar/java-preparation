package dsa.circularlinkedlist;

public class InsertAtBegin {
    private Node insertAtBeginOne(Node head, int data) {
        if (head == null) {
            Node temp = new Node(data);
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }

        Node temp = new Node(data);
        curr.next = temp;
        temp.next = head;
        return temp;
    }

    private Node insertAtBeginBestApproach(Node head, int x) {
        if (head == null) {
            Node temp = new Node(x);
            temp.next = temp;
            return temp;
        }
        Node next = head.next;
        Node temp = new Node(x);
        head.next = temp;
        temp.next = next;
        head.data = head.data + temp.data - (temp.data = head.data);
        return head;
    }
}
