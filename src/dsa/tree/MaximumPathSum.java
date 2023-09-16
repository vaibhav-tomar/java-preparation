package dsa.tree;

public class MaximumPathSum {
    static int res = Integer.MIN_VALUE;

    public static void main(String[] args) {

        findMaxSum(null);
        System.out.println(res);
    }

    static int findMaxSum(TreeNode root) {
        if (root == null) return 0;
        int left = findMaxSum(root.left);
        if (left < 0) left = 0;
        int right = findMaxSum(root.right);
        if (right < 0) right = 0;

        res = Math.max(res, left + right + root.key);
        return Math.max(left, right) + root.key;

    }
}
