package dsa.strings;

public class StringConstantPool {
    public static void main(String[] args) {
        String s1 = "vaibhav";
        String s2 = "vaibhav";
        System.out.println(s1 == s2);

        String s3 = new String("vaibhav");
        System.out.println(s1 == s3);
        System.out.println(s1 == s3.intern());

        String a = "geeks";
        String b = a;

        a = a + "forgeeks";
        System.out.println(a);
        System.out.println(a == b);
    }
}
