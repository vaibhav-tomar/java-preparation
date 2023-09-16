package dsa.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserialize {
    public void serialize(TreeNode root, ArrayList<Integer> a) {
        //code here
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        a.add(root.key);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                if (temp.left != null) {
                    q.add(temp.left);
                    a.add(temp.left.key);
                } else {
                    a.add(null);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                    a.add(temp.right.key);
                } else {
                    a.add(null);
                }
            }
        }


    }

    //Function to deserialize a list and construct the tree.
    public TreeNode deSerialize(ArrayList<Integer> a) {
        //code here
        if (a.size() == 0) return null;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(a.get(0));
        q.add(root);
        int index = 1;
        while (q.size() > 0) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                if (a.get(index) != null) {
                    temp.left = new TreeNode(a.get(index));
                    q.add(temp.left);
                }
                index++;
                if (a.get(index) != null) {
                    temp.right = new TreeNode(a.get(index));
                    q.add(temp.right);
                }
                index++;
            }
        }
        return root;

    }
}
