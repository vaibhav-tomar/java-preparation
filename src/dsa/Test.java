package dsa;

public class Test {
    public static void main(String[] args) {
        System.out.println("Everything is fine!");
        System.out.println("C:\\xyz\\abc.txt");
        System.out.println(~3);
        System.out.println(3 << 2);

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
