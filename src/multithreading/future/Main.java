package multithreading.future;

import java.util.concurrent.*;

/**
 * @author vaibhav
 * created on 06-03-2024
 */
public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(), new CustomExecutionHandler());
        Future<?> futureObj = executor.submit(() -> {
            try {
                Thread.sleep(7000);
                System.out.println("This is the task that thread will execute");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Is done: " + futureObj.isDone());

        try {
            futureObj.get(2, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            System.out.println("timeout exception happened");
        } catch (Exception ex) {

        }

        try {
            futureObj.get();
        } catch (Exception ex) {

        }
        System.out.println("Is done: " + futureObj.isDone());
        System.out.println("Is cancelled: " + futureObj.isCancelled());

        executor.shutdown();
    }

    public static class CustomThreadFactory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {

            Thread thread = new Thread(r);
            thread.setDaemon(false);
            thread.setPriority(Thread.NORM_PRIORITY);
            return thread;
        }
    }

    public static class CustomExecutionHandler implements RejectedExecutionHandler {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("Rejected task handling: " + r.toString());
        }
    }
}
