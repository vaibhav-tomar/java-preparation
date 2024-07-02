package vaibhav.mysdesheet.bitwise;

/**
 * @author vaibhav
 * created on 30-06-2024
 */
public class SumOfBitDifference {
    long sumBitDifference(int arr[]) {
        int n = arr.length;
        int setBitsCount[] = new int[32];
        for (int i = 0; i < n; i++) {
            int number = arr[i];
            int k = 0;
            while (number != 0) {
                int rem = number % 2;
                if (rem == 1) {
                    setBitsCount[k]++;
                }
                k++;
                number = number / 2;
            }
        }
        long sum = 0;
        for (int i = 0; i < 32; i++) {
            sum += 2 * ((long) setBitsCount[i] * (n - setBitsCount[i]));
        }
        return sum;
    }
}
