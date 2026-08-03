package _thread_5_CompleteableFutureAPI;

import java.util.concurrent.CompletableFuture;

// Pizza Example
public class ThenApplyVsThenAccept {
    public static void main(String[] args) {
        // 1. thenApply()  1. thenApply() - Modifies and Returns a Value
        System.out.println("----- thenApply() -----");
        CompletableFuture<String> applyFuture = CompletableFuture.supplyAsync(() -> "Java").thenApply(str -> str.toUpperCase());
        System.out.println(applyFuture.join());


        // 2. thenAccept() 2. thenAccept() - Consumes the Value
        System.out.println("\n----- thenAccept() -----");
        CompletableFuture<Void> acceptFuture =  CompletableFuture.supplyAsync(() -> "Java").thenAccept(str -> System.out.println(str.toUpperCase()));
        acceptFuture.join();


        // 3. Chaining with thenApply()
        System.out.println("\n----- Chaining thenApply() -----");
        CompletableFuture<String> chainFuture = CompletableFuture
                        .supplyAsync(() -> "Java")
                        .thenApply(str -> str.toUpperCase())
                        .thenApply(str -> str + " Programming");
        System.out.println(chainFuture.join());


        // 4. thenAccept() ends the chain
        System.out.println("\n----- thenAccept() Ends the Data Flow -----");
        CompletableFuture<Void> endFuture = CompletableFuture.supplyAsync(() -> "Java").thenAccept(str -> System.out.println(str + " Programming"));
        endFuture.join();

        // Will it Compile | Uncomment and FindOut
        /* CompletableFuture
                .supplyAsync(() -> "Pizza")
                .thenAccept(pizza -> System.out.println("Eating " + pizza))
                .thenApply(pizza -> pizza.toUpperCase());
        */
    }
}