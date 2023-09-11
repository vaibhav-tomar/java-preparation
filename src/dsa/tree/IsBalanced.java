package dsa.tree;

public class IsBalanced {
    public static void main(String[] args) {
        System.out.println(dfsHeight(new TreeNode(2)) != -1);
    }

    public static int dfsHeight(TreeNode root) {

        if (root == null) return 0;

        int lh = dfsHeight(root.left);
        if (lh == -1) return -1;
        int rh = dfsHeight(root.right);
        if (rh == -1) return -1;

        if (Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }
}
