package multithreading.customlocks.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class Main {

    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();

        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(() -> sharedResource.producer(lock));
        Thread thread2 = new Thread(() -> sharedResource.producer(lock));
        Thread thread3 = new Thread(() -> sharedResource.consume(lock));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
