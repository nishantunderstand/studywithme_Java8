package oops3a1_Interface_DefaultMethod;

/**
 * Created : 2026-08-18 20:03:41
 */

public class MainNew {
    public static void main(String[] args) {
        // If nothing is Declared | Then Parent Method is going to be invoked
        System.out.println("====== If nothing is Declared | Then Parent Method is going to be invoked ======");
        SuperCar c2 = new SuperCar();
        c2.start();
    }
}