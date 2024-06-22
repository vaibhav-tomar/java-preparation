package vaibhav.dsa.array;

public class EquilibriumPoint {
    public static void main(String[] args) {
        equilibrium(new int[]{3, 4, 8, -9, 9, 7});
    }

    private static boolean equilibrium(int[] a) {
        int n = a.length;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            rightSum += a[i];
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum = rightSum - a[i];
            if (leftSum == rightSum) return true;
            leftSum += a[i];
        }
        return false;
    }
}
