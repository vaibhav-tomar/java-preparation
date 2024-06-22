package vaibhav.multithreading.customlocks.stampedlock.readwritecapability;

import java.util.concurrent.locks.StampedLock;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class SharedResourceForReadWriteCapability {

    StampedLock lock = new StampedLock();

    public void producer() {
        long stamp = lock.readLock();
        try {
            System.out.println("Read Lock acquired by thread: " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlockRead(stamp);
            System.out.println("Read Lock released by thread: " + Thread.currentThread().getName());
        }
    }

    public void consume() {
        long stamp = lock.writeLock();
        try {
            System.out.println("Write Lock acquired by thread: " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlockWrite(stamp);
            System.out.println("Write Lock released by thread: " + Thread.currentThread().getName());
        }
    }
}
