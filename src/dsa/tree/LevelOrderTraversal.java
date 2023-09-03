package dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    private void levelOrderTraversal(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.key + " ");
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }
}
