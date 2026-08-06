package thread_5_CompleteableFutureAPI;
import java.util.concurrent.CompletableFuture;

public class ThenCombineVsThenCompose {

    public static void main(String[] args) {

        // ==========================================
        // 1. thenCombine() - Combine Two Independent Tasks
        // ==========================================
        System.out.println("----- thenCombine() -----");

        CompletableFuture<Integer> salary = CompletableFuture.supplyAsync(() -> 50000);
        CompletableFuture<Integer> bonus = CompletableFuture.supplyAsync(() -> 10000);
        CompletableFuture<Integer> totalSalary = salary.thenCombine(bonus, (s, b) -> s + b);
        System.out.println("Total Salary : " + totalSalary.join());

        // ==========================================
        // 2. thenCompose() - Chain Dependent Tasks
        // ==========================================
        System.out.println("\n----- thenCompose() -----");

        CompletableFuture<String> orders = CompletableFuture
                        .supplyAsync(() -> "User123")
                        .thenCompose(userId ->CompletableFuture.supplyAsync(() ->"Orders of " + userId));
        System.out.println(orders.join());



        // ==========================================
        // 3. Why thenCompose()?
        // ==========================================
        System.out.println("\n----- thenApply() Creates Nested Future -----");

        CompletableFuture<CompletableFuture<String>> nestedFuture =
                CompletableFuture
                        .supplyAsync(() -> "User123")
                        .thenApply(userId ->
                                CompletableFuture.supplyAsync(() ->
                                        "Orders of " + userId));

        System.out.println(nestedFuture.join().join());



        // ==========================================
        // 4. thenCompose() Flattens Nested Future
        // ==========================================
        System.out.println("\n----- thenCompose() Flattens Future -----");

        CompletableFuture<String> flatFuture =
                CompletableFuture
                        .supplyAsync(() -> "User123")
                        .thenCompose(userId ->
                                CompletableFuture.supplyAsync(() ->
                                        "Orders of " + userId));

        System.out.println(flatFuture.join());
    }
}
/**
 *
 * Interview Rule
 * Use thenCombine() when
 * Two tasks are independent
 * Both can run in parallel
 * Need both results
 *
 * Examples
 *
 * Salary + Bonus
 * User Details + User Address
 * Product + Reviews
 *
 *
 * Use thenCompose() when
 * Second task depends on the first task
 * Avoid nested CompletableFuture
 *
 * Examples
 *
 * Login → User ID → Orders
 * Restaurant → Menu
 * Product ID → Product Details
 *
 *
 */

// Resturant Bill
// ATM Money Withdrawal