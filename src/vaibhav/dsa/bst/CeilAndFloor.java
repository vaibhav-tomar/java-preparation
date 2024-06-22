package vaibhav.dsa.bst;

public class CeilAndFloor {
    int floor = Integer.MIN_VALUE;
    int ceil = Integer.MAX_VALUE;

    private void ceilAndFloor(Node root, int x) {
        if (root == null) return;
        if (root.key == x) {
            ceil = root.key;
            floor = root.key;
            return;
        }
        if (root.key < x) {
            if (root.key > floor) {
                floor = root.key;
            }
        }
        if (root.key > x) {
            if (root.key < ceil) {
                ceil = root.key;
            }
        }
        ceilAndFloor(root.left, x);
        ceilAndFloor(root.right, x);
    }
}

