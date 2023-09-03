package dsa.linkedlist;

public class Middle {

    private void naiveSolution(Node head) {
        if (head == null) return;
        Node curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        curr = head;
        for (int i = 0; i < size / 2; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    private void efficientSolution(Node head) {
        if (head == null) return;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);

    }
}
