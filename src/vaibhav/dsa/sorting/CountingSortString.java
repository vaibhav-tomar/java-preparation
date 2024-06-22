package vaibhav.dsa.sorting;

public class CountingSortString {
    public static void main(String[] args) {
        System.out.println(countSort("edsab"));
    }

    public static String countSort(String s) {
        // code here
        int k = 26;
        int n = s.length();
        int count[] = new int[k];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 1; i < k; i++) {
            count[i] = count[i] + count[i - 1];
        }
        char output[] = new char[n];
        for (int i = s.length() - 1; i >= 0; i--) {
            output[count[s.charAt(i) - 'a'] - 1] = s.charAt(i);
            count[s.charAt(i) - 'a']--;
        }
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str + output[i];
        }
        return str;
    }
}
