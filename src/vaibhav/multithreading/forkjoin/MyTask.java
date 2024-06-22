package vaibhav.multithreading.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * @author vaibhav
 * created on 08-03-2024
 */
public class MyTask extends RecursiveTask {

    int start;
    int end;

    public MyTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 4) {
            int total = 0;
            for (int i = start; i <= end; i++) {
                total += i;
            }
            return total;
        } else {
            int mid = (start + end) / 2;
            MyTask leftTask = new MyTask(start, mid);
            MyTask rightTask = new MyTask(mid + 1, end);

            leftTask.fork();
            rightTask.fork();

            int left = (int) leftTask.join();
            int right = (int) rightTask.join();

            return left + right;
        }
    }
}
