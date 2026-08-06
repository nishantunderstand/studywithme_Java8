package thread_5_CompleteableFutureAPI;

import java.util.concurrent.CompletableFuture;

public class SupplyAndRunAsync {

    public static void main(String[] args) throws Exception {

        // supplyAsync() -> Returns a value
        CompletableFuture<String> supplyFuture = CompletableFuture.supplyAsync(() -> {return "Hello from supplyAsync()";});
        // Returning Something
        System.out.println(supplyFuture.get());


        // runAsync() -> Returns nothing
        CompletableFuture<Void> runFuture = CompletableFuture.runAsync(() -> {System.out.println("Hello from runAsync()");});
        // Wait for completion
        // It is not returning Something.
        runFuture.get();
    }
}
/**
 * What is the difference ???
 */