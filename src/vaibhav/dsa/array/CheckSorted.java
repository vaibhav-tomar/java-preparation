package vaibhav.dsa.array;

public class CheckSorted {
    public static void main(String[] args) {
        int a[] = {3, 5, 1, 2, 9, 7};
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                System.out.println("false");
                break;
            }
        }
    }
}
