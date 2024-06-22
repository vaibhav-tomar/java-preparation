package vaibhav.dsa.maths;

public class CountDigits {
    public static void main(String[] args) {
        int n = 235973;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
