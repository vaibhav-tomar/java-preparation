package vaibhav.dsa.exception;

public class TestHandle {

    public static void main(String[] args) {
        try {
            int a = 2 / 0;
        } catch (ArithmeticException e) {
            System.out.println("In catch block");
        } finally {
            System.out.println("in finally block");
        }

        System.out.println("Exception handled"); // this will get executed only when exception was properly handled in catch block
    }
}
