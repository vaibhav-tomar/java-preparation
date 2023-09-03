package dsa.linkedlist;

public class Search {
    private static int search(Node head, int x) {
        Node curr = head;
        int pos = 0;
        while (curr != null) {
            if (curr.data == x) {
                return pos;
            }
            pos++;
            curr = curr.next;
        }
        return -1;
    }

    private static int searchRecursive(Node head, int x) {
        if (head == null) return -1;
        if (head.data == x) return 1;
        int res = searchRecursive(head.next, x);
        if (res == -1) return res;
        else {
            return res + 1;
        }
    }
}
