package multithreading.customlocks.stampedlock.readwritecapability;


/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class Main {
    public static void main(String[] args) {

        SharedResourceForReadWriteCapability sharedResource = new SharedResourceForReadWriteCapability();
        Thread thread1 = new Thread(() -> sharedResource.producer());
        Thread thread2 = new Thread(() -> sharedResource.producer());
        Thread thread3 = new Thread(() -> sharedResource.consume());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
