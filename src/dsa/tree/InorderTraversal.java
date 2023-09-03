package dsa.tree;

public class InorderTraversal {

    private void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

}

class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
    }
}
