package dsa.tree;

import java.util.ArrayList;

public class PrintNodesAtKDistanceAway {

    static ArrayList<TreeNode> path = new ArrayList<>();

    static void printNodesAtKDistanceAway(TreeNode root, int data, int k) {
        findNodeToRootPath(root, data); // this will fill path arraylist to node to root path;

        for (int i = 0; i < path.size(); i++) {
            printNodesKLevelDown(path.get(i), k - i, i == 0 ? null : path.get(i - 1));
        }
    }

    static boolean findNodeToRootPath(TreeNode root, int data) {
        if (root == null) return false;

        if (root.key == data) {
            path.add(root);
            return true;
        }

        boolean filc = findNodeToRootPath(root.left, data);
        if (filc) {
            path.add(root);
            return true;
        }

        boolean firc = findNodeToRootPath(root.right, data);
        if (firc) {
            path.add(root);
            return true;
        }

        return false;

    }

    static void printNodesKLevelDown(TreeNode root, int k, TreeNode blocker) {
        if (root == null || k < 0 || root == blocker) return;
        if (k == 0) {
            System.out.println(root.key);
        }
        printNodesKLevelDown(root.left, k - 1, blocker);
        printNodesKLevelDown(root.right, k - 1, blocker);
    }
}
