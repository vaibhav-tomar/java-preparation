package multithreading.customlocks.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author vaibhav
 * created on 01-03-2024
 */
public class SharedResource {
    public void myMethod(ReentrantLock lock) {
        try {
            lock.lock();
            System.out.println("Lock acquired by thread: " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
