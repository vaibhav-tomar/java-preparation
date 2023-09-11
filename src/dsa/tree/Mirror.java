package dsa.tree;

public class Mirror {
    void mirror(TreeNode node) {
        // Your code here
        if (node == null) return;

        mirror(node.left);
        mirror(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;


    }
}
