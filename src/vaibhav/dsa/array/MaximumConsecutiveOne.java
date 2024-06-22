package vaibhav.dsa.array;

public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        int a[] = {0, 1, 1, 0, 1, 0};
        int n = a.length;
        int index = 0;
        int count = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                count++;
            } else {
                res = Math.max(count, res);
                count = 0;
            }
        }
        System.out.println(res);
    }
}
