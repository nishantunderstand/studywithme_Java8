package oops2_Inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== Wednesday, August 26, 2026 9:28:18 PM ======\n");

//        Parent p1 = new Parent();
//        p1.start();
//
//        Child c1 = new Child();
//        c1.start();
//
//        Parent pc = new Child();
//        pc.start();
//

//        Child c2 = new Parent(); // Compiler Error
//        // You need to type cast to hold me.
//        c2.start();


        // You need to use typecast operator to Implement it.
//        Child c3 = (Child) new Parent();
//        c3.start();
        // Now it will start failing at Runtime Exception.
        // ClassCastException.


        // What is happening here ? I am not able to understand it  ??? #ExplainMe
        // TODO
        System.out.println("4th One I am working  ??? #ExplainMe");
        Parent p = new Child();
        Child c4 = (Child) p;
        c4.start();

    }
}
