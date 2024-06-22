package vaibhav.dsa.tree;

import java.util.HashMap;
import java.util.Map;

public class TreeFromPostOrderAndInorder {
    TreeNode buildTree(int in[], int post[], int n) {
        // Your code here

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }

        return buildTree(in, post, 0, in.length - 1, 0, post.length - 1, map);

    }

    TreeNode buildTree(int in[], int post[], int is, int ie, int ps, int pe, Map<Integer, Integer> map) {

        if (is > ie || ps > pe) return null;

        TreeNode root = new TreeNode(post[pe]);

        int rootIndex = map.get(post[pe]);
        int leftElements = rootIndex - is;
        int rightElements = ie - rootIndex;

        root.left = buildTree(in, post, is, rootIndex - 1, ps, ps + leftElements - 1, map);
        root.right = buildTree(in, post, rootIndex + 1, ie, ps + leftElements, pe - 1, map);

        return root;

    }
}
