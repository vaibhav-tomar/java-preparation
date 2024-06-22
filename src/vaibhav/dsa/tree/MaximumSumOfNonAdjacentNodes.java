package vaibhav.dsa.tree;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumOfNonAdjacentNodes {
    static Map<TreeNode, Integer> map;

    static int getMaxSum(TreeNode root) {
        // add your code here
        map = new HashMap<>();
        return getSum(root);

    }

    static int getSum(TreeNode root) {
        if (root == null) return 0;
        if (map.get(root) != null) {
            return map.get(root);
        }
        int inc = root.key;
        int exc = 0;

        if (root.left != null) {
            inc += getSum(root.left.left) + getSum(root.left.right);
        }
        if (root.right != null) {
            inc += getSum(root.right.left) + getSum(root.right.right);
        }

        exc += getSum(root.left) + getSum(root.right);

        int ans = Math.max(inc, exc);
        map.put(root, ans);
        return ans;
    }
}
