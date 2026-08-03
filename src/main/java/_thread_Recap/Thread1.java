package _thread_Recap;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


// Please Note : You need to declare Checked Exception Otherwise it will not run.
public class Thread1 {
    public static void main(String[] args) throws Exception{
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Callable<Integer> tk = () -> 1000;
        Future<Integer> f = ex.submit(tk);
        System.out.println(f.get());
        ex.shutdown();
    }
}
