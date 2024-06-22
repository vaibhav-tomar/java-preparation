package vaibhav.dsa.tree;

public class Maximum {

    private int maximum(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        int leftMax = maximum(root.left);
        int rightMax = maximum(root.right);

        return Math.max(Math.max(leftMax, rightMax), root.key);
    }
}
