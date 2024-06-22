package vaibhav.testdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author vaibhav
 * created on 08-06-2024
 */
public class TestDemo {

    public static void main(String[] args) {
        replaceSpecialElement();
        System.out.println();
        reverse();
    }

    public static void reverse() {
        List<Integer> al = Arrays.asList(1, 2, 3, 4, 5);
        int start = 0;
        int end = al.size() - 1;

        while (start < end) {
            int temp = al.get(start);
            al.set(start, al.get(end));
            al.set(end, temp);
            start++;
            end--;
        }

        for (int a : al) {
            System.out.print(a + " ");
        }
    }

    private static void replaceSpecialElement() {
        List<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("#");
        al.add("c");
        al.add("#");
        al.add("d");

        int inititalSize = al.size();
        for (int i = 0; i < inititalSize; i++) {
            String value = al.get(0);
            if (value == "#") {
                al.add("1");
                al.add("2");
                al.add("3");
            } else {
                al.add(value);
            }
            al.remove(0);
        }
        for (String s : al) {
            System.out.print(s + " ");
        }
    }
}
