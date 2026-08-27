package oops3a1_Interface_DefaultMethod;


public class Main {
    public static void main(String[] args) {
        System.out.println("====== Tuesday, August 18, 2026 8:19:29 PM ======");

        Vehicle v = new Car();
        v.start();

        System.out.println("====== Thursday, August 27, 2026 10:53:25 PM ======");

        Car c1 = new Car();
        c1.start();


        // Question : Can I call vechile method from main ?
    }
}