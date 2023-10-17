package dsa.strings;

public class Basics {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s3.intern());
        System.out.println(s1.equals(s3));

        String s = "geeksforgeeks";
        System.out.println(s.indexOf("geeks"));
        System.out.println(s.indexOf("geeks", 2));

        String a = "geeks";
        String b = a;
        a = a + "forGgeeks";
        System.out.println(a == b);
    }
}
