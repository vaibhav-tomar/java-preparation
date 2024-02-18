package dsa;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Collection<Integer> values = map.values();
        List<Integer> al = new ArrayList<>();
        Iterator<Integer> iterator = al.iterator();
        System.out.println("abc".substring(0, 1));
        map.computeIfAbsent(1, (v) -> 6);


    }
}
