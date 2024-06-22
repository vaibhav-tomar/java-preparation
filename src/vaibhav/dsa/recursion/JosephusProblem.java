package vaibhav.dsa.recursion;

public class JosephusProblem {
    public int jos(int n, int k) {
        if (n == 0) return 0;
        int res = jos(n - 1, k);
        return (res + k) % n;
    }
}
