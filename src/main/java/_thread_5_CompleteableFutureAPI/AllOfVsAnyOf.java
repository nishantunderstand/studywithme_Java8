package _thread_5_CompleteableFutureAPI;

import java.util.concurrent.CompletableFuture;

public class AllOfVsAnyOf {

    public static void main(String[] args) {

        CompletableFuture<String> rahul =
                CompletableFuture.supplyAsync(() -> {
                    sleep(3000);
                    return "Rahul Accepted";
                });

        CompletableFuture<String> aman =
                CompletableFuture.supplyAsync(() -> {
                    sleep(2000);
                    return "Aman Accepted";
                });

        CompletableFuture<String> rohit =
                CompletableFuture.supplyAsync(() -> {
                    sleep(1000);
                    return "Rohit Accepted";
                });

        // ==========================================
        // anyOf() -> First Delivery Partner
        // ==========================================
        System.out.println("----- anyOf() -----");

        CompletableFuture<Object> any =
                CompletableFuture.anyOf(rahul, aman, rohit);

        System.out.println(any.join());


        // ==========================================
        // allOf() -> Wait for Everyone
        // ==========================================
        System.out.println("\n----- allOf() -----");

        CompletableFuture<Void> all =
                CompletableFuture.allOf(rahul, aman, rohit);

        all.join();

        System.out.println(rahul.join());
        System.out.println(aman.join());
        System.out.println(rohit.join());
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}