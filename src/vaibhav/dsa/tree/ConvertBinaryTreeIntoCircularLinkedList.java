package vaibhav.dsa.tree;

public class ConvertBinaryTreeIntoCircularLinkedList {
    TreeNode prev = null;
    TreeNode head = null;

    TreeNode bTreeToClist(TreeNode root) {
        //your code here
        prev = null;
        head = null;
        return makeDll(root);

    }

    TreeNode makeDll(TreeNode root) {
        if (root == null) return null;
        makeDll(root.left);
        if (prev == null) {
            head = root;
        } else {
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        makeDll(root.right);
        head.left = prev;
        prev.right = head;
        return head;
    }
}
