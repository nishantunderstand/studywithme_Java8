package _lambda100;

/**
 *
 */
public class a_Template {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello, Lambda");
        new Thread(r).start();
        new MyThread().start();
    }


}

