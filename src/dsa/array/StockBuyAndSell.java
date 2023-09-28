package dsa.array;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int a[] = {1, 5, 3, 8, 12};
        int n = a.length;
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                profit = profit + (a[i] - a[i - 1]);
            }
        }
        System.out.println(profit);

    }
}
