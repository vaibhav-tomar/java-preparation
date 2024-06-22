package vaibhav.dsa.tree;

import java.util.ArrayList;

public class PrintNodeToRoot {

    ArrayList<Integer> al = new ArrayList<>();

    boolean findNodeToRoot(TreeNode root, int data) {

        if (root == null) {
            return false;
        }
        if (root.key == data) {
            al.add(root.key);
            return true;
        }

        boolean filc = findNodeToRoot(root.left, data);
        if (filc) {
            al.add(root.key);
            return true;
        }
        boolean firc = findNodeToRoot(root.right, data);
        if (firc) {
            al.add(root.key);
            return true;
        }

        return false;
    }
}
