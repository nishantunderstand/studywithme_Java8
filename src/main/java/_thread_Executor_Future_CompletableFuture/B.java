package _thread_Executor_Future_CompletableFuture;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class B {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Start Time
        long start = System.currentTimeMillis();
        System.out.println("Started At:" + LocalDateTime.now());

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return "Hello Future!!";
        });

        String result = future.get();
        // Always used with Exception
        // Synchronus Work or Aysnchronous Task
        System.out.println("Result : "+ result);
        Long end = System.currentTimeMillis();


        System.out.println("Ended At : " + LocalTime.now());
        System.out.println("Total Time Taken : " + (end - start) + " ms");
        
        executorService.shutdown();

    }

}
