package vaibhav.mysdesheet.searchingandsorting;

/**
 * @author vaibhav
 * created on 30-06-2024
 */
public class ProductArrayPuzzle {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] res = new int[n];
        prefix[0] = A[0];
        suffix[n - 1] = A[n - 1];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * A[i];
            suffix[n - i - 1] = suffix[n - i] * A[n - i - 1];
        }
        res[0] = suffix[1];
        res[n - 1] = prefix[n - 2];
        for (int i = 1; i < n - 1; i++) {
            res[i] = prefix[i - 1] * suffix[i + 1];
        }
        return res;
    }
}
