package vaibhav.dsa.bst;

public class Search {

    private boolean search(Node root, int x) {
        if (root == null) return false;
        if (root.key == x) return true;
        if (x < root.key) {
            return search(root.left, x);
        } else {
            return search(root.right, x);
        }
    }
}

class Node {
    Node left;
    Node right;
    int key;

    Node(int key) {
        this.key = key;
    }
}
