package vaibhav.dsa.strings;

public class Reverse {
    public static void main(String[] args) {
        String s = "vaibhav";
        String res = "";
        int ptr = s.length() - 1;
        while (ptr >= 0) {
            res = res + s.charAt(ptr);
            ptr--;
        }
        System.out.println(res);

    }
}
