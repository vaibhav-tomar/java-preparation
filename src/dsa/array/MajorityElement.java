package dsa.array;

public class MajorityElement {
    public static void main(String[] args) {
        int a[] = {8, 8, 6, 6, 6, 4, 6};
        int n = a.length;
        int res = 0;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[res]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == a[res]) {
                count++;
            }
        }
        if (count > n / 2) System.out.println(a[res]);
        else System.out.println("does not exist");
    }
}
