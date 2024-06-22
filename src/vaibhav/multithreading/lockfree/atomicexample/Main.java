package vaibhav.multithreading.lockfree.atomicexample;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                sharedResource.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                sharedResource.increment();
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sharedResource.get());
    }
}
