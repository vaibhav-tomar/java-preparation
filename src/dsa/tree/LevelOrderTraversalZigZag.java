package dsa.tree;

import java.util.ArrayList;
import java.util.Stack;

public class LevelOrderTraversalZigZag {
    static ArrayList<Integer> printZigZag(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        Stack<TreeNode> ms = new Stack<>();
        Stack<TreeNode> cs = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        ms.add(root);
        int level = 0;
        while (!ms.isEmpty()) {
            TreeNode temp = ms.pop();
            al.add(temp.key);
            if (level % 2 == 0) {
                if (temp.right != null) {
                    cs.add(temp.right);
                }
                if (temp.left != null) {
                    cs.add(temp.left);

                }
            } else {
                if (temp.left != null) {
                    cs.add(temp.left);
                }
                if (temp.right != null) {
                    cs.add(temp.right);
                }
            }

            if (ms.size() == 0) {
                ms = cs;
                cs = new Stack<>();
                level++;
            }
        }
        return al;
    }
}
