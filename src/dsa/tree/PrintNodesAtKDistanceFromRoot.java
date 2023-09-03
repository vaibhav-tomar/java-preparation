package dsa.tree;

public class PrintNodesAtKDistanceFromRoot {
    private void printAtKDistanceFromRoot(Node root, int k) {
        if (root == null) return;
        if (k == 0) System.out.print(root.key + " ");
        else {
            printAtKDistanceFromRoot(root.left, k - 1);
            printAtKDistanceFromRoot(root.right, k - 1);
        }

    }
}
