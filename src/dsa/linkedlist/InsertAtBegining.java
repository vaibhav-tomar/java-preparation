package dsa.linkedlist;

public class InsertAtBegining {
    public Node insertAtBegin(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }
}
