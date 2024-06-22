package vaibhav.dsa.sorting;

import java.util.Arrays;

public class MaximunGuests {
    public static void main(String[] args) {
        int arr[] = {800, 700, 600, 500};
        int dep[] = {840, 820, 830, 530};
        Arrays.sort(arr);
        Arrays.sort(dep);
        int res = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] < dep[j]) {
                count++;
                i++;
            } else if (arr[i] > dep[j]) {
                count--;
                j++;
            }
            res = Math.max(res, count);
        }
        System.out.println(res);
    }
}
