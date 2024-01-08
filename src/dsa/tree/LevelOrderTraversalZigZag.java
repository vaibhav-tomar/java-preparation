package dsa.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalZigZag {
    static ArrayList<ArrayList<Integer>> printZigZag(TreeNode root) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;
        while (queue.isEmpty() == false) {
            int size = queue.size();
            ArrayList<Integer> al = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int index = leftToRight ? i : size - 1 - i;
                al.add(index, node.key);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(al);
            leftToRight = !leftToRight;

        }
        return res;
    }
}
