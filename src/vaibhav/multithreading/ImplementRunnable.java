package vaibhav.multithreading;

public class ImplementRunnable {

    public static void main(String[] args) {
        System.out.println("running main thread");
        Test t = new Test();
        Thread thread = new Thread(t);
        thread.start();
    }

    public static class Test implements Runnable {

        @Override
        public void run() {
            System.out.println("running new thread");
        }
    }
}
