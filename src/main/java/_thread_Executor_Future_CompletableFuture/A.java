package _thread_Executor_Future_CompletableFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(()->{
            System.out.println("Task 1 Executing");
        });

        executorService.submit(()->{
            System.out.println("Task 2 Executing");
        });

        executorService.shutdown();
    }
}
