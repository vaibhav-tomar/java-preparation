package vaibhav.multithreading.customlocks.stampedlock.optimisticlockcapability;

import java.util.concurrent.locks.StampedLock;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class SharedResourceForOptimisticReadCapability {

    int a = 10;
    StampedLock lock = new StampedLock();

    public void producer() {
        long stamp = lock.tryOptimisticRead();
        try {
            System.out.println("Taken optimistic read lock by thread: " + Thread.currentThread().getName());
            a = 11;
            Thread.sleep(4000);
            if (lock.validate(stamp)) {
                System.out.println("value updated successfully");
            } else {
                System.out.println("rollback the update");
                a = 10;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void consume() {
        long stamp = lock.writeLock();
        System.out.println("Write Lock acquired by thread: " + Thread.currentThread().getName());

        try {
            System.out.println("performing work");
            a = 9;
        } finally {
            lock.unlockWrite(stamp);
            System.out.println("Write Lock released by thread: " + Thread.currentThread().getName());
        }
    }
}
