package vaibhav.multithreading.threadpoolexecutor;

import java.util.concurrent.*;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(), new CustomExecutionHandler());

        for (int i = 1; i <= 7; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task processed by thread: " + Thread.currentThread().getName());
            });
        }
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
