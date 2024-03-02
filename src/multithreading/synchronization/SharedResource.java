package multithreading.synchronization;

/**
 * @author vaibhav
 * created on 01-03-2024
 */
public class SharedResource {

    public synchronized void myMethod() {
        try {
            System.out.println("Lock acquired by thread: " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
