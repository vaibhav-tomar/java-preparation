package multithreading.forkjoin;

import java.util.concurrent.*;

/**
 * @author vaibhav
 * created on 08-03-2024
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newWorkStealingPool(Runtime.getRuntime().availableProcessors());
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        ForkJoinTask submit = forkJoinPool.submit(new MyTask(1, 20));
        try {
            System.out.println(submit.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
