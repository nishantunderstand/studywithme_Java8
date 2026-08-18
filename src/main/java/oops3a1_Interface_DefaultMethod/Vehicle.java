package oops3a1_Interface_DefaultMethod;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}