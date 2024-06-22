package vaibhav.multithreading.customlocks.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class SharedResource {
    public void producer(ReadWriteLock lock) {
        try {
            lock.readLock().lock();
            System.out.println("Read Lock acquired by thread: " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.readLock().unlock();
            System.out.println("Read Lock released by thread: " + Thread.currentThread().getName());
        }
    }

    public void consume(ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by thread: " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.writeLock().unlock();
            System.out.println("Write Lock released by thread: " + Thread.currentThread().getName());
        }
    }
}
