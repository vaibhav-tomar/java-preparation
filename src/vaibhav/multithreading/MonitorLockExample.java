package vaibhav.multithreading;

/**
 * @author vaibhav
 * created on 25-02-2024
 */
public class MonitorLockExample {

    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
        Thread thread1 = new Thread(() -> obj.task1());
        Thread thread2 = new Thread(() -> obj.task2());
        Thread thread3 = new Thread(() -> obj.task3());
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public synchronized void task1() {
        try {
            System.out.println("inside task 1");
            Thread.sleep(10000);
        } catch (Exception e) {

        }
    }

    public void task2() {
        System.out.println("inside task 2, before synchronized block");
        synchronized (this) {
            System.out.println("task 2, inside synchronized block");
        }
    }

    public void task3() {
        System.out.println("inside task 3");
    }
}
