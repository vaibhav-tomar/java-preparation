package vaibhav.multithreading.lockfree.example;

/**
 * @author vaibhav
 * created on 02-03-2024
 */
public class SharedResource {
    int counter;

    public void increment() {
        counter++;
    }

    public int get() {
        return counter;
    }
}
