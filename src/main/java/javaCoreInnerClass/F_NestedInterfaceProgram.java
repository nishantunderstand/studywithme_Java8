package javaCoreInnerClass;

/**
 * Created : 2026-08-05 19:10:00
 *
 * Topic : Nested Interface
 *
 * Interview Questions
 * -------------------
 * Q1. Can an interface be declared inside a class?
 * Q2. Is a nested interface static?
 * Q3. How do you implement a nested interface?
 */
public class F_NestedInterfaceProgram {

    interface Printer {

        void print();
    }
}

class LaserPrinter implements F_NestedInterfaceProgram.Printer {

    @Override
    public void print() {
        System.out.println("Printing...");
    }
}

class Main {

    public static void main(String[] args) {

        F_NestedInterfaceProgram.Printer printer =
                new LaserPrinter();

        printer.print();
    }
}