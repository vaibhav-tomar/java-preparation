package vaibhav.dsa.doublylinkedlist;

public class Reverse {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        temp2.next = temp3;
        temp3.prev = temp2;
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.data + " ");
        }
        head = reverse(head);
        System.out.println();
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.data + " ");
        }
    }

    //    10 -> 20 -> 30 -> 40
    //    10 <- 20 <- 30 <- 40
    private static Node reverse(Node head) {
        if (head == null) return null;
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            if (prev != null) prev.prev = curr;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
