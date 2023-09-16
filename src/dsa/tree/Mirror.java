package dsa.tree;

public class Mirror {
    boolean checkMirror(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }

        boolean leftCall = checkMirror(left.left, right.right);
        boolean rightCall = checkMirror(left.right, right.left);

        return leftCall && rightCall;
    }
}
