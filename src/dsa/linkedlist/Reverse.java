package dsa.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

    private void naiveMethod(Node head) {
        List<Integer> al = new ArrayList<>();
        for (Node curr = head; curr != null; curr = curr.next) {
            al.add(curr.data);
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            curr.data = al.remove(al.size() - 1);
        }
    }

    private Node bastApproach(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
