package vaibhav.dsa.strings;

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 10;
        String res = "";
        while (num > 0) {
            res = (num % 2) + res;
            num = num / 2;
        }
        System.out.println(res);
    }
}
