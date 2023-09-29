package dsa.Searching;

public class RepeatingElement {

    public static void main(String[] args) {
        int a[] = {1, 3, 2, 4, 6, 5, 7, 3};
        efficientApproach(a);
        System.out.println(bestSolution(a));

    }

    private static int bestSolution(int[] a) {
        int slow = a[0];
        int fast = a[0];
        do {
            slow = a[slow];
            fast = a[a[fast]];
        }
        while (slow != fast);
        slow = a[0];
        while (slow != fast) {
            slow = a[slow];
            fast = a[fast];
        }
        return slow;
    }

    private static int efficientApproach(int[] a) {
        int n = a.length;
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[a[i]]) {
                return a[i];
            }
            visited[a[i]] = true;
        }
        return -1;
    }
}
