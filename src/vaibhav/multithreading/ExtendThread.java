package vaibhav.multithreading;

public class ExtendThread {

    public static void main(String[] args) {
        System.out.println("running in main thread");
        Test t = new Test();
        t.start();
    }

    public static class Test extends Thread {
        @Override
        public void run() {
            System.out.println("running in new thread");
        }
    }
}
