package greyorange;

/**
 * @author vaibhav
 * created on 28-02-2024
 */
public class Test {
    public static void main(String[] args) {
//        String s = "My name is vaibhav is my my name is";
//        Map<String, Integer> map = new HashMap<>();
//        String[] split = s.split(" ");
//        for(String str : split) {
//            map.put(str, map.getOrDefault(str, 0) + 1);
//        }
//        for(Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey() + " occurs " + e.getValue() + " times");
//        }


        int a[] = {1, 0, 0, 1, 1, 0, 0, 1, 0};
        int n = a.length;
        int pointer = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                a[i] = a[i] + a[pointer] - (a[pointer] = a[i]);
                pointer++;
            }
        }
        for (int x : a) {
            System.out.print(x + " ");
        }

    }

    class Student {
        int id;
        int age;
        String name;
    }
}
