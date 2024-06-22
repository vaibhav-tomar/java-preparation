package vaibhav.dsa.strings;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String s = "10001";
        int ptr = s.length() - 1;
        int res = 0;
        while (ptr >= 0) {
            if (s.charAt(ptr) == '1') {
                res = res + (int) Math.pow(2, ptr);
            }
            ptr--;
        }
        System.out.println(res);
    }
}
