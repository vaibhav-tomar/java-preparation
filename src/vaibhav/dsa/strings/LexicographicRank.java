package vaibhav.dsa.strings;

public class LexicographicRank {
    public static void main(String[] args) {
        String s = "string";
        int n = s.length();
        int count[] = new int[256];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 1; i < 256; i++) {
            count[i] = count[i] + count[i - 1];
        }

        int res = 0;
        int mul = getFact(n);
        for (int i = 0; i < n - 1; i++) {
            mul = mul / (n - i);
            res = res + count[s.charAt(i) - 1] * mul;
            for (int j = s.charAt(i); j < 256; j++) {
                count[j]--;
            }
        }

        System.out.println(res + 1);
    }

    private static int getFact(int n) {
        int fact = 1;
        for (int i = n; i >= 2; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
