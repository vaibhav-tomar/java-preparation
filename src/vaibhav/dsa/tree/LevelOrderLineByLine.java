package vaibhav.dsa.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLineByLine {
    public static void main(String[] args) {

    }

    static ArrayList<ArrayList<Integer>> levelOrder(TreeNode node) {
        // Your code here
        if (node == null) return new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                al.add(temp.key);
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            res.add(al);
        }
        return res;

    }
}
