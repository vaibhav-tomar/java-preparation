package vaibhav.dsa.maths;

import java.util.Scanner;

public class Lcm {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = Math.max(a, b);
        int res = 0;
        for (int i = max; i < a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}
