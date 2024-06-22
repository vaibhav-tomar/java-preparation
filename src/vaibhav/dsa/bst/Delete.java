package vaibhav.dsa.bst;

public class Delete {

    private Node delete(Node root, int x) {
        if (root == null) return null;

        if (x < root.key) {
            root.left = delete(root.left, x);
        } else if (x > root.key) {
            root.right = delete(root.right, x);
        } else {
            if (root.left != null && root.right != null) {
                int leftMax = getMax(root.left); // find left maximum
                root.key = leftMax; // replace our node data with left max
                root.left = delete(root.left, leftMax);
            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        return root;

    }

    private int getMax(Node node) {
        if (node.right != null) return (getMax(node.right));
        else {
            return node.key;
        }
    }
}
