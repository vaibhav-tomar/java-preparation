package vaibhav.multithreading.implementproducerconsumer;

/**
 * @author vaibhav
 * created on 01-03-2024
 */
public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);
        Thread producerThread = new Thread(() -> {
            for (int i = 1; i <= 6; i++) {
                sharedResource.produce(i);
            }
        });
        Thread consumerThread = new Thread(() -> {
            for (int i = 1; i <= 6; i++) {
                sharedResource.consume();
            }
        });

        producerThread.start();
        consumerThread.start();
    }


}
