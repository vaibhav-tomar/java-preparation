package vaibhav.dsa.linkedlist;

public class RemoveDuplicatesFromSortedLL {
    public static void main(String[] args) {
        Node temp = new Node(10);
        temp.next = new Node(20);
        temp.next.next = new Node(20);
        temp.next.next.next = new Node(30);
        temp.next.next.next.next = new Node(30);
        temp.next.next.next.next.next = new Node(30);
        remove(temp);
        for (Node curr = temp; curr != null; curr = curr.next) {
            System.out.print(curr.data + " ");
        }
    }

    private static Node remove(Node head) {
        if (head == null) return null;
        Node curr = head;
        while (curr != null) {
            if (curr.next != null && curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else curr = curr.next;
        }
        return head;
    }
}
