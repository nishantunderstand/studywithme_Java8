package thread_5_CompleteableFutureAPI;

import java.util.concurrent.CompletableFuture;

public class GetVsJoin {

    public static void main(String[] args) {

        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {
                    throw new RuntimeException("API Failed");
                });

        // ==========================================
        // get()
        // ==========================================
        System.out.println("----- get() -----");

        try {
            System.out.println(future.get());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getClass().getSimpleName());
            System.out.println("Message   : " + e.getMessage());
        }


        // ==========================================
        // join()
        // ==========================================
        System.out.println("\n----- join() -----");
        System.out.println(future.join());

    }
}


/**

| `get()`                          | `join()`                       |
| -------------------------------- | ------------------------------ |
| Checked exceptions               | Unchecked exceptions           |
| `ExecutionException`             | `CompletionException`          |
| Requires `try-catch` or `throws` | No `throws` needed             |
| Comes from `Future`              | Comes from `CompletableFuture` |

*/