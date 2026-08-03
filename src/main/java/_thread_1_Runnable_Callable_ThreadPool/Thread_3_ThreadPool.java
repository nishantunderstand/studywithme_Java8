package _thread_1_Runnable_Callable_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_3_ThreadPool {
    public static void main(String[] args) {
        ExecutorService ex1 = Executors.newSingleThreadExecutor();
        ExecutorService ex = Executors.newFixedThreadPool(4);
        ExecutorService ex3 = Executors.newCachedThreadPool();
        ExecutorService ex4 = Executors.newScheduledThreadPool(2);

        for (int i = 1; i <= 10; i++) {
            int task = i;
            ex.submit(() -> {
                System.out.println("Task " + task + " started by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + task +" finished by " +Thread.currentThread().getName());
            });
        }
        ex.shutdown();
    }
}
