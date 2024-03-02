package multithreading.implementproducerconsumer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author vaibhav
 * created on 01-03-2024
 */
public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) {
        while (sharedBuffer.size() == bufferSize) {
            try {
                System.out.println("Buffer is full, producer is waiting");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        sharedBuffer.add(item);
        System.out.println("Produced: " + item);
        // notify the consumer that there are items to consume
        notify();
    }

    public synchronized int consume() {
        while (sharedBuffer.size() == 0) {
            try {
                System.out.println("Buffer is empty, consumer is waiting");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int item = sharedBuffer.remove();
        System.out.println("Consumed: " + item);
        // notify the producer that there is space in the buffer now
        notify();
        return item;
    }
}
