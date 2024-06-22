package vaibhav.multithreading.customlocks.semaphore;


/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(() -> sharedResource.produce());
        Thread thread2 = new Thread(() -> sharedResource.produce());
        Thread thread3 = new Thread(() -> sharedResource.produce());
        Thread thread4 = new Thread(() -> sharedResource.produce());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
