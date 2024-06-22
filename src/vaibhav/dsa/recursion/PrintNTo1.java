package vaibhav.dsa.recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
        printNTo1(5);
    }

    private static void printNTo1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNTo1(n - 1);
    }
}
