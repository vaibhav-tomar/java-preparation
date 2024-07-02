package vaibhav.mysdesheet.matrix;

import java.util.ArrayList;

/**
 * @author vaibhav
 * created on 02-07-2024
 */
public class SpiralTraversal {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (r > 1 && c > 1) {
            for (int it = 1; it < c; it++) {
                al.add(matrix[i][j]);
                j++;
            }
            for (int it = 1; it < r; it++) {
                al.add(matrix[i][j]);
                i++;
            }
            for (int it = 1; it < c; it++) {
                al.add(matrix[i][j]);
                j--;
            }
            for (int it = 1; it < r; it++) {
                al.add(matrix[i][j]);
                i--;
            }
            i++; j++;
            r -= 2;
            c -= 2;
        }
        if (r == 1 && c == 1) al.add(matrix[i][j]);
        else if (r == 1) {
            for (int it = 1; it <= c; it++) {
                al.add(matrix[i][j]);
                j++;
            }
        } else if (c == 1) {
            for (int it = 1; it <= r; it++) {
                al.add(matrix[i][j]);
                i++;
            }
        }
        return al;

    }
}
