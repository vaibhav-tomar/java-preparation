package dsa.strings;

public class PrintFrequenciesInSortedOrder {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " occurs " + freq[i] + " times");
            }
        }
    }
}
