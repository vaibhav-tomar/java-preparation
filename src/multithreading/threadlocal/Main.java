package multithreading.threadlocal;

/**
 * @author vaibhav
 * created on 09-03-2024
 */
public class Main {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();

        threadLocal.set(Thread.currentThread().getName());

        Thread thread = new Thread(() -> {
            threadLocal.set(Thread.currentThread().getName());
            System.out.println("my thread task");
            System.out.println(threadLocal.get());

            // to clean up the value in thread local object
            threadLocal.remove();
        });
        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadLocal.get());
    }
}
