package dsa.tree;

import java.util.Stack;

public class IterativeTraversal {

    private void iterativeTraversal(TreeNode root) {
        String pre = "";
        String post = "";
        String in = "";
        if (root == null) return;
        Stack<Pair> s = new Stack<>();
        s.push(new Pair(root, 1));
        while (s.size() > 0) {
            Pair top = s.peek();
            if (top.state == 1) {
                top.state++;
                pre += top.node.key + " ";
                if (top.node.left != null) {
                    s.push(new Pair(top.node.left, 1));
                }

            } else if (top.state == 2) {
                top.state++;
                in += top.node.key + " ";
                if (top.node.right != null) {
                    s.push(new Pair(top.node.right, 1));
                }
            } else {
                top.state++;
                post += top.node.key + " ";
                s.pop();
            }
        }
    }

    static class Pair {
        TreeNode node;
        int state;

        Pair(TreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }
}
