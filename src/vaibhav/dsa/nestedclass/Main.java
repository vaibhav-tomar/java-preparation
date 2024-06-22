package vaibhav.dsa.nestedclass;

/**
 * @author vaibhav
 * created on 11-03-2024
 */
public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
