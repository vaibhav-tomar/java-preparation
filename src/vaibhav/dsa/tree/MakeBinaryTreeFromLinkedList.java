package vaibhav.dsa.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MakeBinaryTreeFromLinkedList {

    public static TreeNode solutionOne(Node head, TreeNode node) {
        if (head == null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        node = new TreeNode(head.data);
        q.add(node);
        while (q.size() > 0) {
            TreeNode temp = q.poll();
            if (head == null) continue;
            if (head.next != null) {
                temp.left = new TreeNode(head.next.data);
                q.add(temp.left);
                head = head.next;
            }
            if (head.next != null) {
                temp.right = new TreeNode(head.next.data);
                q.add(temp.right);
                head = head.next;
            }

        }
        return node;
    }

    public static TreeNode solutionTwo(Node head, TreeNode node) {
        if (head == null) return null;
        ArrayList<TreeNode> al = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            al.add(new TreeNode(curr.data));
            curr = curr.next;
        }
        int n = al.size();
        int i = 0;
        while (true) {
            if (2 * i + 1 < n) {
                al.get(i).left = al.get(2 * i + 1);
            } else {
                break;
            }
            if (2 * i + 2 < n) {
                al.get(i).right = al.get(2 * i + 2);
            } else {
                break;
            }
            i++;
        }
        return al.get(0);
    }
}

class Node {
    int data;
    Node next;
}
