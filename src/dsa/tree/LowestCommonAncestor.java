package dsa.tree;

import java.util.ArrayList;

public class LowestCommonAncestor {

    ArrayList<TreeNode> al = new ArrayList<>();

    TreeNode lca(TreeNode root, int n1, int n2) {
        // Your code here
        getLcaMethodOne(root, n1, n2);

        return getLcaEfficient(root, n1, n2);
    }

    private TreeNode getLcaEfficient(TreeNode root, int n1, int n2) {
        if (root == null) return null;
        if (root.key == n1 || root.key == n2) return root;

        TreeNode left = lca(root.left, n1, n2);
        TreeNode right = lca(root.right, n1, n2);

        if (left == null) return right;
        if (right == null) return left;

        return root;
    }

    private TreeNode getLcaMethodOne(TreeNode root, int n1, int n2) {
        if (root == null) return null;
        TreeNodeToRootPath(root, n1);
        ArrayList<TreeNode> pathOne = al;
        al = new ArrayList<>();
        TreeNodeToRootPath(root, n2);
        ArrayList<TreeNode> pathTwo = al;
        if (pathOne.size() == 0 || pathTwo.size() == 0) return null;

        for (int i = 0; i < pathOne.size(); i++) {
            if (pathTwo.contains(pathOne.get(i))) {
                return pathOne.get(i);
            }
        }
        return null;
    }

    boolean TreeNodeToRootPath(TreeNode root, int data) {

        if (root == null) return false;

        if (root.key == data) {
            al.add(root);
            return true;
        }

        boolean filc = TreeNodeToRootPath(root.left, data);
        if (filc) {
            al.add(root);
            return true;
        }

        boolean firc = TreeNodeToRootPath(root.right, data);
        if (firc) {
            al.add(root);
            return true;
        }

        return false;
    }
}
