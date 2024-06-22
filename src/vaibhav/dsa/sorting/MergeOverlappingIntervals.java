package vaibhav.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        new MergeOverlappingIntervals().merge();

    }

    private void merge() {
        Pair[] a = new Pair[6];
        a[0] = new Pair(22, 28);
        a[1] = new Pair(1, 8);
        a[2] = new Pair(25, 27);
        a[3] = new Pair(14, 19);
        a[4] = new Pair(27, 30);
        a[5] = new Pair(5, 12);

        Arrays.sort(a, (o1, o2) -> o1.s - o2.s);
        List<Pair> res = new ArrayList<>();
        res.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (a[i].s > res.get(res.size() - 1).e) {
                res.add(a[i]);
            } else {
                res.set(res.size() - 1, new Pair(res.get(res.size() - 1).s, Math.max((res.get(res.size() - 1).e), a[i].e)));
            }
        }

        System.out.println(res);

    }


    class Pair {
        int s;
        int e;

        Pair(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "s=" + s +
                    ", e=" + e +
                    '}';
        }

    }
}


