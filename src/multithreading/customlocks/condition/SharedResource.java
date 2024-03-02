package multithreading.customlocks.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class SharedResource {

    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void producer() {
        try {
            lock.lock();
            System.out.println("Producer Lock acquired by thread: " + Thread.currentThread().getName());
            if (isAvailable) {
                System.out.println("producer thread is waiting");
                condition.await();
            }
            isAvailable = true;
            condition.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
            System.out.println("producer Lock released by thread: " + Thread.currentThread().getName());
        }
    }

    public void consume() {
        try {
            Thread.sleep(1000);
            lock.lock();
            System.out.println("Consumer Lock acquired by thread: " + Thread.currentThread().getName());
            if (isAvailable == false) {
                System.out.println("consumer thread is waiting");
                condition.await();
            }
            isAvailable = true;
            condition.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
            System.out.println("Consumer Lock released by thread: " + Thread.currentThread().getName());
        }
    }
}
