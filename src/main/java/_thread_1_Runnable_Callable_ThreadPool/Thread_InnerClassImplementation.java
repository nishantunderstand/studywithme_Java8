package _thread_1_Runnable_Callable_ThreadPool;

public class Thread_InnerClassImplementation {

    static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("Thread By Extending ");
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
