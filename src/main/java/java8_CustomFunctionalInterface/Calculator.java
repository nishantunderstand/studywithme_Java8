package java8_CustomFunctionalInterface;

//Created : 2026-08-18 20:51:03

@FunctionalInterface
interface Calculator {

    // Abstract method
    int calculate(int a, int b);

    // Default method
    default void print() {
        System.out.println("Calculator");
    }

    // Static method
    static void info() {
        System.out.println("Calculator Interface");
    }
}

// Wrtie a Custom Function Interface
// Is it neccssary to annotate with it ? NOT Neccessary
// What if we don't annotate it ?
// Can we other method as well ?

/**
 *     interface Calculator {
 *     int calculate(int a, int b);
 *     int subtract(int a, int b); // 👈 added accidentally
 * }
 *
 * Here the @FunctionInterface Annotation play an important role ???
 */