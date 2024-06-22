package vaibhav.dsa.array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int a[] = {10, 20, 20, 30, 30, 40, 40};
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[index] != a[i]) {
                index++;
                a[index] = a[i];

            }
        }
        System.out.println(index + 1);
        for (int x : a) {
            System.out.println(x);
        }
    }
}
