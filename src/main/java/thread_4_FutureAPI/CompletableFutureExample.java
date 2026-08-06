package thread_4_FutureAPI;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) throws Exception {
        // By default, CompletableFuture uses the ForkJoinPool.commonPool(), so you don't need an ExecutorService.
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
            System.out.println("Running on: " + Thread.currentThread().getName());
            return "Hello By Completable Future";
        });
        System.out.println(cf.get());
    }
}


/**
 * CallableFuture Doesn't have execute or submit kind of thing.
 * As it already had ForkJoinPool Common.
 * So we don't need it
 */
