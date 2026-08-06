package thread_2_Extending_Thread;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Running From Extend Keyword");
    }
}
