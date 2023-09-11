package dsa.tree;

public class Size {
    private int size(TreeNode root) {
        if (root == null) return 0;
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return leftSize + rightSize + 1;
    }
}
