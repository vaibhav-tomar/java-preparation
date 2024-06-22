package vaibhav.multithreading.completablefuture;

import java.util.concurrent.*;

/**
 * @author vaibhav
 * created on 07-03-2024
 */
public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                new vaibhav.multithreading.future.Main.CustomThreadFactory(),
                new vaibhav.multithreading.future.Main.CustomExecutionHandler());

        CompletableFuture<String> task = CompletableFuture.supplyAsync(() -> {
            System.out.println("task completed successfully");
            return "task completed";
        }, executor);

        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("thread suppluasync: {}" + Thread.currentThread().getName());
            return "vaibhav";
        }, executor).thenApply((String val) -> {
            System.out.println("thread thenApply: {}" + Thread.currentThread().getName());
            return val + "tomar";
        });
        try {
            String s = task2.get();
            System.out.println(s);
        } catch (Exception ex) {
        }

        CompletableFuture<String> task3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("thread supply async: {}" + Thread.currentThread().getName());

            return "swati";
        }, executor).thenApplyAsync((String val) -> {
            System.out.println("thread thenApplyAsync: {}" + Thread.currentThread().getName());

            return val + "tomar";
        });
        try {
            String s = task3.get();
            System.out.println(s);
        } catch (Exception ex) {
        }

        CompletableFuture<String> task4 = CompletableFuture.supplyAsync(() -> {
            System.out.println("thread supply async: {}" + Thread.currentThread().getName());
            return "swati";
        }, executor).thenCompose((String val) -> {
            System.out.println("thread then compose: {}" + Thread.currentThread().getName());
            return CompletableFuture.supplyAsync(() -> val + "one");
        }).thenComposeAsync((String val) -> {
            System.out.println("thread then compose async: {}" + Thread.currentThread().getName());
            return CompletableFuture.supplyAsync(() -> val + "two");
        });
        try {
            String s = task4.get();
            System.out.println(s);
        } catch (Exception ex) {
        }

        CompletableFuture<Void> task5 = CompletableFuture.supplyAsync(() -> {
            System.out.println("thread supply async: {}" + Thread.currentThread().getName());

            return "shaifali";
        }, executor).thenAccept((String val) -> {
            System.out.println("thread thenApplyAsync: {}" + Thread.currentThread().getName());
            System.out.println(val + "maliktomar");
        });
        try {
            task5.get();
        } catch (Exception ex) {
        }

        CompletableFuture<String> task6 = CompletableFuture.supplyAsync(() -> {
            System.out.println("thread supply async: {}" + Thread.currentThread().getName());
            return "abhishek";
        }, executor);

        CompletableFuture<Integer> task7 = CompletableFuture.supplyAsync(() -> {
            System.out.println("thread supply async: {}" + Thread.currentThread().getName());
            return 10;
        }, executor);

        CompletableFuture<String> result = task6.thenCombine(task7,
                (String v1, Integer v2) -> v1 + v2);
        try {
            String s = result.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
