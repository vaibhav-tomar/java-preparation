package multithreading.synchronization;

/**
 * @author vaibhav
 * created on 01-03-2024
 */
public class Main {

    public static void main(String[] args) {
        SharedResource one = new SharedResource();
        Thread thread1 = new Thread(() -> {
            one.myMethod();
        });
        Thread thread2 = new Thread(() -> {
            one.myMethod();
        });
        thread1.start();
        thread2.start();
    }

}
