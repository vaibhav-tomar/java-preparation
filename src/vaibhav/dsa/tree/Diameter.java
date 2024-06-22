package vaibhav.dsa.tree;

public class Diameter {

    int res = 0;

    int diameter(TreeNode root) {
        // Your code here
        height(root);
        return res;

    }

    int height(TreeNode root) {
        if (root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        int totalHt = Math.max(lh, rh) + 1;
        int diameter = lh + rh + 1;
        res = Math.max(res, diameter);
        return totalHt;
    }
}
