package vaibhav.multithreading.customlocks.condition;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                sharedResource.producer();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                sharedResource.consume();
            }
        });

        thread1.start();
        thread2.start();
    }
}
