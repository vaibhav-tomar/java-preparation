package multithreading.lockfree.atomicexample;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class SharedResource {
    AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int get() {
        return counter.get();
    }
}
