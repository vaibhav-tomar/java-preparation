package vaibhav.dsa.array;

public class MaximumAppearingElement {
    public static void main(String[] args) {
        int left[] = {1, 2, 4};
        int right[] = {4, 5, 7,};
        System.out.println(maxAppear(left, right));
    }

    private static int maxAppear(int[] left, int[] right) {
        int freq[] = new int[100];
        for (int i = 0; i < left.length; i++) {
            freq[left[i]]++;
            freq[right[i] + 1]--;
        }
        int res = 0;
        for (int i = 1; i < 100; i++) {
            freq[i] = freq[i - 1] + freq[i];
            if (freq[i] > freq[res]) {
                res = i;
            }
        }
        return res;
    }
}
