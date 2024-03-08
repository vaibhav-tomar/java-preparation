package dsa;

import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        Driver driver = new Driver();
        Driver.testModifier();

        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("1", "test");
        map.put(null, "etstnull");
        map.put(null, "bestNull");
        map.put(null, null);
        map.put(null, null);
        System.out.println(map);
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println("map -> " + e.getKey() + e.getValue());
        }

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add(null);
        set.add(null);
        System.out.println(set);
        List<Demo> al = new ArrayList<>();
        al.stream().collect(Collectors.groupingBy(Demo::getAge, TreeMap::new, Collectors.toSet()));
    }

    @Data
    static class Demo {
        int age;
        int name;
    }
}
