package vaibhav.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int a[] = {10, 12, 10, 15, 10, 20, 12, 12};
        bestSol(a);
        naiveSol(a);
    }

    private static void naiveSol(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean appearedAlready = false;
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    appearedAlready = true;
                    break;
                }
            }
            if (appearedAlready) continue;
            int freq = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) freq++;
            }
            System.out.println(a[i] + " occurs " + freq + " times");
        }
    }

    private static void bestSol(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
