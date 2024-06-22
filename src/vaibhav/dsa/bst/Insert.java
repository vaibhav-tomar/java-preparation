package vaibhav.dsa.bst;

public class Insert {

    private Node insert(Node root, int x) {
        if (root == null) return new Node(x);
        if (root.key == x) {
            // do nothing
        } else if (x < root.key) {
            root.left = insert(root.left, x);
        } else {
            root.right = insert(root.right, x);
        }
        return root;
    }
}
