package vaibhav.mysdesheet.matrix;

/**
 * @author vaibhav
 * created on 02-07-2024
 */
public class RowWithMaxOne {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i = 0;
        int j = m - 1;
        int res = -1;
        while (i < n && j >= 0) {
            while (j >= 0 && arr[i][j] == 1) {
                res = i;
                j--;
            }
            i++;
        }
        return res;
    }
}
