package dsa.recursion;

public class NoOfSubsetWithSum {
    static int count = 0;

    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        int x = 30;
        int sum = 0;
        noOfSubset(arr, x, 0, sum);
    }

    private static void noOfSubset(int[] arr, int x, int i, int sum) {
        if (i == arr.length) {
            if (sum == x) {
                count++;
            }
            return;
        }
        noOfSubset(arr, x, i + 1, sum + arr[i]);
        noOfSubset(arr, x, i + 1, sum);
    }
}
