package thread_4_FutureAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<String> future = ex.submit(()->{
            Thread.sleep(200);
            return "Sync Task Task Completed";
        });

        System.out.println(future.get());
        ex.shutdown();
    }
}


/**
 * Future support execute or submit
 */