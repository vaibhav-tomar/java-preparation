package multithreading.callable;

import multithreading.future.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author vaibhav
 * created on 07-03-2024
 */
public class Callable {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                new Main.CustomThreadFactory(), new Main.CustomExecutionHandler());

        // this submit method accepts a runnable task and returns null
        Future<?> futureObjOne = executor.submit(() -> {
            System.out.println("runnable example for type 1");
        });

        try {
            Object o = futureObjOne.get();
            System.out.println(o == null);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        // this submit method accepts runnable and a result object and returns this object
        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> futureObjTwo = executor.submit(() -> {
            System.out.println("runnable example for type 2");
            output.add(27);
        }, output);

        try {
            List<Integer> al = futureObjTwo.get();
            System.out.println(al == null);
            System.out.println(al.get(0));
            System.out.println(output.get(0));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        // this submit method accepts callable task(here we return object in our task itself)

        Future<List<Integer>> futureObjThree = executor.submit(() -> {
            System.out.println("callable example for type 3");
            List<Integer> al = new ArrayList<>();
            al.add(11);
            return al;
        });

        try {
            List<Integer> al = futureObjThree.get();
            System.out.println(al == null);
            System.out.println(al.get(0));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
