package vaibhav.multithreading.customlocks.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author vaibhav
 * created on 01-03-2024
 */
public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        SharedResource sharedResource1 = new SharedResource();
        Thread thread1 = new Thread(() -> sharedResource1.myMethod(lock));

        SharedResource sharedResource2 = new SharedResource();
        Thread thread2 = new Thread(() -> sharedResource2.myMethod(lock));

        thread1.start();
        thread2.start();
    }
}
