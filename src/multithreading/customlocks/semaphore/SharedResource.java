package multithreading.customlocks.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class SharedResource {

    Semaphore lock = new Semaphore(2);

    public void produce() {
        try {
            lock.acquire();
            System.out.println("Lock acquired by thread: " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.release();
            System.out.println("Lock released by thread: " + Thread.currentThread().getName());

        }
    }
}
