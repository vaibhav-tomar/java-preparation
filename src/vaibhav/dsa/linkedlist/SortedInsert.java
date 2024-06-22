package vaibhav.dsa.linkedlist;

public class SortedInsert {

    private Node sortedInsert(Node head, int data) {
        if (head == null) return new Node(data);
        if (data <= head.data) {
            Node temp = new Node(data);
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data <= data) {
            curr = curr.next;
        }

        Node temp = new Node(data);
        temp.next = curr.next;
        curr.next = temp;
        return head;


    }
}
